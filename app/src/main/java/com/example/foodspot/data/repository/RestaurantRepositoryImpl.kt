package com.example.foodspot.data.repository

import com.example.foodspot.data.model.Dish
import com.example.foodspot.data.model.Restaurant

class RestaurantRepositoryImpl : RestaurantRepository {

    private val restaurants = listOf(
        Restaurant(
            id = 1,
            name = "Pizza Palace",
            description = "Auténtica pizza italiana con ingredientes frescos",
            imageUrl = "https://picsum.photos/seed/pizza/400/300",
            categories = listOf("Italiana", "Comida Rápida"),
            menu = listOf(
                Dish(1, "Pizza Margarita", "Clásica con queso y tomate", "https://picsum.photos/seed/margarita/400/300"),
                Dish(2, "Pizza Pepperoni", "Con abundante pepperoni", "https://picsum.photos/seed/pepperoni/400/300")
            )
        ),
        Restaurant(
            id = 2,
            name = "Sushi World",
            description = "Delicias japonesas frescas y auténticas",
            imageUrl = "https://picsum.photos/seed/sushi/400/300",
            categories = listOf("Asiática"),
            menu = listOf(
                Dish(3, "Sushi Roll", "Rollo de salmón y aguacate", "https://picsum.photos/seed/roll/400/300"),
                Dish(4, "Nigiri", "Arroz con pescado fresco", "https://picsum.photos/seed/nigiri/400/300")
            )
        ),
        Restaurant(
            id = 3,
            name = "Green Bites",
            description = "Comida saludable y nutritiva",
            imageUrl = "https://picsum.photos/seed/salad/400/300",
            categories = listOf("Saludable"),
            menu = listOf(
                Dish(5, "Ensalada César", "Con pollo y aderezo ligero", "https://picsum.photos/seed/cesar/400/300"),
                Dish(6, "Smoothie Verde", "Espinaca, manzana y jengibre", "https://picsum.photos/seed/smoothie/400/300")
            )
        ),
        Restaurant(
            id = 4,
            name = "Burger Haven",
            description = "Las mejores hamburguesas artesanales de la ciudad",
            imageUrl = "https://picsum.photos/seed/burger/400/300",
            categories = listOf("Comida Rápida"),
            menu = listOf(
                Dish(7, "Classic Burger", "Carne de res, lechuga y tomate", "https://picsum.photos/seed/classic/400/300"),
                Dish(8, "BBQ Burger", "Con aros de cebolla y salsa BBQ", "https://picsum.photos/seed/bbq/400/300")
            )
        ),
        Restaurant(
            id = 5,
            name = "Pasta House",
            description = "Pasta fresca hecha a mano todos los días",
            imageUrl = "https://picsum.photos/seed/pasta/400/300",
            categories = listOf("Italiana"),
            menu = listOf(
                Dish(9, "Lasagna", "Capas de carne y queso fundido", "https://picsum.photos/seed/lasagna/400/300"),
                Dish(10, "Fettuccine Alfredo", "Salsa blanca cremosa", "https://picsum.photos/seed/alfredo/400/300")
            )
        ),
        Restaurant(
            id = 6,
            name = "Wok & Roll",
            description = "Sabor oriental en cada bocado",
            imageUrl = "https://picsum.photos/seed/wok/400/300",
            categories = listOf("Asiática"),
            menu = listOf(
                Dish(11, "Pad Thai", "Fideos de arroz con camarones", "https://picsum.photos/seed/padthai/400/300"),
                Dish(12, "Ramen", "Caldo tradicional con huevo y cerdo", "https://picsum.photos/seed/ramen/400/300")
            )
        ),
        Restaurant(
            id = 7,
            name = "Veggie Delight",
            description = "Platos vegetarianos llenos de sabor",
            imageUrl = "https://picsum.photos/seed/veggie/400/300",
            categories = listOf("Saludable"),
            menu = listOf(
                Dish(13, "Bowl de Quinoa", "Con vegetales asados", "https://picsum.photos/seed/quinoa/400/300"),
                Dish(14, "Tacos de Coliflor", "Con salsa picante suave", "https://picsum.photos/seed/tacosv/400/300")
            )
        ),
        Restaurant(
            id = 8,
            name = "Taco Fiesta",
            description = "Auténtica comida mexicana rápida",
            imageUrl = "https://picsum.photos/seed/taco/400/300",
            categories = listOf("Comida Rápida"),
            menu = listOf(
                Dish(15, "Tacos al Pastor", "Cerdo marinado con piña", "https://picsum.photos/seed/pastor/400/300"),
                Dish(16, "Burrito Supremo", "Frijoles, carne y guacamole", "https://picsum.photos/seed/burrito/400/300")
            )
        ),
        Restaurant(
            id = 9,
            name = "Osteria Romana",
            description = "Trattoria tradicional con recetas clásicas",
            imageUrl = "https://picsum.photos/seed/osteria/400/300",
            categories = listOf("Italiana"),
            menu = listOf(
                Dish(17, "Carbonara", "Receta original sin crema", "https://picsum.photos/seed/carbonara/400/300"),
                Dish(18, "Tiramisú", "El postre italiano por excelencia", "https://picsum.photos/seed/tiramisu/400/300")
            )
        ),
        Restaurant(
            id = 10,
            name = "Zen Garden",
            description = "Cocina zen para el alma",
            imageUrl = "https://picsum.photos/seed/zen/400/300",
            categories = listOf("Asiática", "Saludable"),
            menu = listOf(
                Dish(19, "Miso Soup", "Sopa de soja tradicional", "https://picsum.photos/seed/miso/400/300"),
                Dish(20, "Poke Bowl", "Atún fresco y vegetales", "https://picsum.photos/seed/poke/400/300")
            )
        ),
        Restaurant(
            id = 11,
            name = "Fit Fuel",
            description = "Energía pura para tu entrenamiento",
            imageUrl = "https://picsum.photos/seed/fit/400/300",
            categories = listOf("Saludable"),
            menu = listOf(
                Dish(21, "Pollo al Grill", "Con batata y brócoli", "https://picsum.photos/seed/grill/400/300"),
                Dish(22, "Omelette de Claras", "Con espinaca y pavo", "https://picsum.photos/seed/omelette/400/300")
            )
        )
    )

    override fun getRestaurants(): List<Restaurant> = restaurants

    override fun getRestaurantById(id: Int): Restaurant? =
        restaurants.find { it.id == id }

    override fun searchRestaurants(query: String): List<Restaurant> {
        val q = query.lowercase()
        return restaurants.filter { restaurant ->
            restaurant.name.lowercase().contains(q) ||
                    restaurant.menu.any { dish -> dish.name.lowercase().contains(q) }
        }
    }
}
