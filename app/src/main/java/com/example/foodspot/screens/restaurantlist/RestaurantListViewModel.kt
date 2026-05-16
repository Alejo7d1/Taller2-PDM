package com.example.foodspot.screens.restaurantlist

import androidx.lifecycle.ViewModel
import com.example.foodspot.data.model.Restaurant
import com.example.foodspot.data.repository.RestaurantRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class RestaurantListViewModel(
    private val repository: RestaurantRepository
) : ViewModel() {

    private val _restaurants = MutableStateFlow<List<Restaurant>>(emptyList())
    val restaurants = _restaurants.asStateFlow()

    init {
        _restaurants.value = repository.getRestaurants()
    }

    fun getCategories(): List<String> {
        return _restaurants.value.flatMap { it.categories }.distinct()
    }

    fun getRestaurantsByCategory(category: String): List<Restaurant> {
        return _restaurants.value.filter { it.categories.contains(category) }
    }
}