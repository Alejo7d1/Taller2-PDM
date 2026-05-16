package com.example.foodspot.data.repository

import com.example.foodspot.data.model.Restaurant

interface RestaurantRepository {
    fun getRestaurants(): List<Restaurant>
    fun getRestaurantById(id: Int): Restaurant?
    fun searchRestaurants(query: String): List<Restaurant>
}

