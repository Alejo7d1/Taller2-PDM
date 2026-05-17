package com.example.foodspot

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.example.foodspot.data.repository.RestaurantRepositoryImpl
import com.example.foodspot.navigation.Destination
import com.example.foodspot.screens.restaurantdetail.RestaurantDetailScreen
import com.example.foodspot.screens.restaurantdetail.RestaurantDetailViewModel
import com.example.foodspot.screens.restaurantlist.RestaurantListScreen
import com.example.foodspot.screens.restaurantlist.RestaurantListViewModel
import com.example.foodspot.screens.restaurantsearch.RestaurantSearchScreen
import com.example.foodspot.screens.restaurantsearch.RestaurantSearchViewModel
import com.example.foodspot.ui.theme.FoodSpotTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val repository = RestaurantRepositoryImpl()

        enableEdgeToEdge()
        setContent {
            FoodSpotTheme {
                val backStack = rememberNavBackStack(Destination.RestaurantList)

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavDisplay(
                        backStack = backStack,
                        modifier = Modifier,
                        onBack = { 
                            if (backStack.size > 1) backStack.removeAt(backStack.size - 1) 
                        },
                        entryProvider = entryProvider {

                            // Lista de los estaurantes
                            entry<Destination.RestaurantList> {
                                val viewModel: RestaurantListViewModel = viewModel(
                                    factory = viewModelFactory {
                                        initializer { RestaurantListViewModel(repository) }
                                    }
                                )
                                RestaurantListScreen(
                                    viewModel = viewModel,
                                    onNavigateToDetail = { id -> 
                                        backStack.add(Destination.RestaurantDetail(id)) 
                                    },
                                    onNavigateToSearch = { 
                                        backStack.add(Destination.Search) 
                                    }
                                )
                            }
                            
                            // Detalle de Restaurante
                            entry<Destination.RestaurantDetail> { key ->
                                val viewModel: RestaurantDetailViewModel = viewModel(
                                    key = "RestaurantDetail_${key.restaurantId}",
                                    factory = viewModelFactory {
                                        initializer { RestaurantDetailViewModel(repository, key.restaurantId) }
                                    }
                                )
                                RestaurantDetailScreen(
                                    viewModel = viewModel,
                                    onBack = { backStack.removeAt(backStack.size - 1) }
                                )
                            }
                            
                            // Búsqueda
                            entry<Destination.Search> {
                                val viewModel: RestaurantSearchViewModel = viewModel(
                                    factory = viewModelFactory {
                                        initializer { RestaurantSearchViewModel(repository) }
                                    }
                                )
                                RestaurantSearchScreen(
                                    viewModel = viewModel,
                                    onNavigateToDetail = { id -> 
                                        backStack.add(Destination.RestaurantDetail(id)) 
                                    },
                                    onBack = { backStack.removeAt(backStack.size - 1) }
                                )
                            }
                        }
                    )
                }
            }
        }
    }
}
