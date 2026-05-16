package com.example.foodspot.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
sealed interface Destination : NavKey {
    @Serializable
    data object RestaurantList : Destination

    @Serializable
    data class RestaurantDetail(val restaurantId: Int) : Destination

    @Serializable
    data object Search : Destination
}
