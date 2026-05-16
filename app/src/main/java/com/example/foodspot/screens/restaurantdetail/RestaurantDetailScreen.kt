package com.example.foodspot.screens.restaurantdetail

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RestaurantDetailScreen(
    viewModel: RestaurantDetailViewModel,
    onBack: () -> Unit
) {
    val restaurantState = viewModel.restaurant.collectAsState()
    val restaurant = restaurantState.value
    val context = LocalContext.current

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(restaurant?.name ?: "Detalle") },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Volver")
                    }
                }
            )
        }
    ) { padding ->
        restaurant?.let { res ->
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding),
                contentPadding = PaddingValues(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                item {
                    Column {
                        AsyncImage(
                            model = ImageRequest.Builder(LocalContext.current)
                                .data(res.imageUrl)
                                .crossfade(true)
                                .build(),
                            contentDescription = res.name,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(200.dp),
                            contentScale = ContentScale.Crop
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(res.description, style = MaterialTheme.typography.bodyLarge)
                    }
                }
                
                item {
                    Text("Menú", style = MaterialTheme.typography.titleLarge)
                }

                items(res.menu) { dish ->
                    Card(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(modifier = Modifier.padding(12.dp)) {
                            AsyncImage(
                                model = ImageRequest.Builder(LocalContext.current)
                                    .data(dish.imageUrl)
                                    .crossfade(true)
                                    .build(),
                                contentDescription = dish.name,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                contentScale = ContentScale.Crop
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(dish.name, style = MaterialTheme.typography.titleMedium)
                            Text(dish.description, style = MaterialTheme.typography.bodyMedium)
                            Spacer(modifier = Modifier.height(8.dp))
                            Button(
                                onClick = {
                                    Toast.makeText(
                                        context,
                                        "${dish.name} agregado al carrito",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                },
                                modifier = Modifier.align(Alignment.End)
                            ) {
                                Text("Agregar")
                            }
                        }
                    }
                }
            }
        } ?: Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            CircularProgressIndicator()
        }
    }
}
