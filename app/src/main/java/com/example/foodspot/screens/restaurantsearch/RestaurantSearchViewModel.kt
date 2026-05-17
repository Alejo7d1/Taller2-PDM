package com.example.foodspot.screens.restaurantsearch

import androidx.lifecycle.ViewModel
import com.example.foodspot.data.model.Restaurant
import com.example.foodspot.data.repository.RestaurantRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class RestaurantSearchViewModel(
    private val repository: RestaurantRepository
) : ViewModel() {

    private val _query = MutableStateFlow("")
    val query: StateFlow<String> = _query.asStateFlow()

    private val _results = MutableStateFlow<List<Restaurant>>(emptyList())
    val results: StateFlow<List<Restaurant>> = _results.asStateFlow()

    fun onQueryChanged(newQuery: String) {
        _query.value = newQuery
        val q = newQuery.trim()
        if (q.isEmpty()) {
            _results.value = emptyList()
            return
        }

        _results.value = repository.searchRestaurants(q)
    }

    fun clearQuery() {
        _query.value = ""
        _results.value = emptyList()
    }
}
