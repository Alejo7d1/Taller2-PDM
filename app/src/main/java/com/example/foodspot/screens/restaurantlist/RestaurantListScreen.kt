package com.example.foodspot.screens.restaurantlist

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest

import androidx.compose.ui.text.style.TextAlign

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RestaurantListScreen(
    viewModel: RestaurantListViewModel,
    onNavigateToDetail: (Int) -> Unit,
    onNavigateToSearch: () -> Unit
) {
    val categories = viewModel.getCategories()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("FoodSpot") },
                actions = {
                    IconButton(onClick = onNavigateToSearch) {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "Buscar"
                        )
                    }
                }
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            categories.forEach { category ->
                item {
                    Text(
                        text = category,
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 8.dp)
                    )
                }
                item {
                    LazyRow(
                        contentPadding = PaddingValues(horizontal = 16.dp),
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        items(viewModel.getRestaurantsByCategory(category)) { restaurant ->
                            Card(
                                modifier = Modifier.width(160.dp),
                                onClick = { onNavigateToDetail(restaurant.id) }
                            ) {
                                Column {
                                    AsyncImage(
                                        model = ImageRequest.Builder(LocalContext.current)
                                            .data(restaurant.imageUrl)
                                            .crossfade(true)
                                            .build(),
                                        contentDescription = restaurant.name,
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .height(100.dp),
                                        contentScale = ContentScale.Crop
                                    )
                                    Column(modifier = Modifier.padding(8.dp)) {
                                        Text(
                                            text = restaurant.name,
                                            style = MaterialTheme.typography.titleSmall,
                                            maxLines = 1,
                                            modifier = Modifier.fillMaxWidth(),
                                            textAlign = TextAlign.Center
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
