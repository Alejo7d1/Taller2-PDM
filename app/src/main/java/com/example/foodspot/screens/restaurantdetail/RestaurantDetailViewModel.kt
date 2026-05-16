package com.example.foodspot.screens.restaurantdetail

import androidx.lifecycle.ViewModel
import com.example.foodspot.data.model.Restaurant
import com.example.foodspot.data.repository.RestaurantRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class RestaurantDetailViewModel(
    private val repository: RestaurantRepository,
    restaurantId: Int
) : ViewModel() {

    private val _restaurant = MutableStateFlow<Restaurant?>(null)
    val restaurant = _restaurant.asStateFlow()

    init {
        _restaurant.value = repository.getRestaurantById(restaurantId)
    }
}
