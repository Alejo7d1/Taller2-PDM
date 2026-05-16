package com.example.foodspot.screens.restaurantsearch

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.foodspot.data.model.Restaurant

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RestaurantSearchScreen(
    viewModel: RestaurantSearchViewModel,
    onNavigateToDetail: (Int) -> Unit,
    onBack: () -> Unit
) {
    val query = viewModel.query.collectAsState()
    val results = viewModel.results.collectAsState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    TextField(
                        value = query.value,
                        onValueChange = { viewModel.onQueryChanged(it) },
                        placeholder = { Text("Buscar restaurantes o platillos") },
                        singleLine = true,
                        trailingIcon = {
                            if (query.value.isNotEmpty()) {
                                IconButton(onClick = { viewModel.clearQuery() }) {
                                    Icon(imageVector = Icons.Default.Clear, contentDescription = "Limpiar")
                                }
                            }
                        },
                        modifier = Modifier.fillMaxWidth()
                    )
                },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Volver")
                    }
                }
            )
        }
    ) { padding ->
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(padding)) {

            when {
                query.value.isEmpty() -> {
                    // Estado inicial: sugerencia o vacío
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text("Escribe para buscar restaurantes o platillos", style = MaterialTheme.typography.bodyLarge)
                    }
                }

                results.value.isEmpty() -> {
                    // No hay resultados
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text("No se encontraron resultados", style = MaterialTheme.typography.bodyLarge)
                    }
                }

                else -> {
                    // Mostrar resultados (lista de restaurantes)
                    LazyColumn(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(8.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        items(results.value) { restaurant ->
                            RestaurantSearchItem(
                                restaurant = restaurant,
                                onClick = { onNavigateToDetail(restaurant.id) }
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun RestaurantSearchItem(
    restaurant: Restaurant,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Min)
            .clickable(onClick = onClick)
    ) {
        Row(modifier = Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(restaurant.imageUrl)
                    .crossfade(true)
                    .build(),
                contentDescription = restaurant.name,
                modifier = Modifier
                    .size(84.dp),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(end = 8.dp)) {
                Text(text = restaurant.name, style = MaterialTheme.typography.titleMedium, maxLines = 1)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = restaurant.description, style = MaterialTheme.typography.bodyMedium, maxLines = 2)
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = restaurant.categories.joinToString(", "),
                    style = MaterialTheme.typography.labelSmall
                )
            }
        }
    }
}
