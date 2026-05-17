package com.example.foodspot.data.repository

import com.example.foodspot.data.model.Dish
import com.example.foodspot.data.model.Restaurant

class RestaurantRepositoryImpl : RestaurantRepository {

    private val restaurants = listOf(
        Restaurant(
            id = 1,
            name = "Bombo Pizza",
            description = "La pizzería de Bombo destaca por su sabor autentico elaborada por el gran Bombo Venturi, un experimentado cocinero",
            imageUrl = "https://static.vecteezy.com/system/resources/previews/017/734/649/non_2x/pizza-food-logo-brand-product-badge-cartoon-style-illustration-editable-text-vector.jpg",
            categories = listOf("Italiana", "Comida Rápida"),
            menu = listOf(
                Dish(1, "Pizza Margarita", "Clásica con queso mozzarella y albahaca fresca.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdKHb1ElELvHFGaaGisID29fmnI4z5V1537Bmm68gEo1DcRXDrty2BYich&s=10"),
                Dish(2, "Pizza Pepperoni", "Con abundante pepperoni premium y base crocante.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR2wNXYsGcGr2WS6JqsFSgkzM1rzR2PaF-THsAxq0xmnky54_30Eizz68Y&s=10"),
                Dish(101, "Pizza XL", "Pizza con tamaño gigante", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR2wNXYsGcGr2WS6JqsFSgkzM1rzR2PaF-THsAxq0xmnky54_30Eizz68Y&s=10")
            )
        ),
        Restaurant(
            id = 2,
            name = "La Pupusería Gato Matato",
            description = "Pupusas artesanales hechas al comal con recetas tradicionales salvadoreñas.",
            imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTn0kj_ma2osLoqreoBbt-RdvpVNhH9vQKR1e-JE7xJQ-QTwNY9LN4M9ug&s=10",
            categories = listOf("Comida Rápida"),
            menu = listOf(
                Dish(3, "Pupusa de Queso", "Pupusa rellena de queso fresco, servida con curtido y salsa.", "https://cdn7.kiwilimon.com/recetaimagen/2806/640x640/25790.jpg.webp"),
                Dish(4, "Pupusa Revuelta", "Pupusa rellena de queso, frijol y chicharrón, acompañada de curtido casero.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTqbwDQRa7lKALNNBTwYCkQW-BYUi1iDVTyJZ9q_3Qq0ab-p3K2ykD0dKc&s=10"),
                Dish(102, "Yuca Frita con Curtido", "Porción de yuca frita crujiente servida con curtido y salsa de la casa.", "https://i.ytimg.com/vi/dp6oQ7cekPc/hq720.jpg?sqp=-oaymwEhCK4FEIIDSFryq4qpAxMIARUAAAAAGAElAADIQj0AgKJD&rs=AOn4CLD_uCGqj37uh-_NzS1hLcYF4KvUxA")
            )
        ),
        Restaurant(
            id = 3,
            name = "Green Bites",
            description = "Comida saludable que nutre tu cuerpo y deleita tu paladar.",
            imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQEUgYm7K3r60sIB2_FUWJL-6YSVXgmvGO-yqFYxjEFWSTBytJ7pah1GmQ&s=10",
            categories = listOf("Saludable"),
            menu = listOf(
                Dish(5, "Ensalada César", "Pollo grillado, lechuga romana y aderezo artesanal.", "https://sandersonfarms.com/wp-content/uploads/2017/04/Recipes_Roast_Chicken_with_Garlic_and_Lime_Thumb_420x420.jpg"),
                Dish(6, "Smoothie Verde", "Espinaca orgánica, manzana verde y jengibre.", "https://www.laylita.com/recetas/wp-content/uploads/Ensalada-de-lechuga-con-limon-y-cilantro.jpg"),
                Dish(103, "Bowl Mediterráneo", "Quinoa, garbanzos, aceitunas y queso feta.", "https://www.laylita.com/recetas/wp-content/uploads/Ensalada-de-lechuga-con-limon-y-cilantro.jpg")
            )
        ),
        Restaurant(
            id = 4,
            name = "Hamburguesa ReBurger",
            description = "Hamburguesas de esas horribles que hacen con guantes de latex por algún motivo",
            imageUrl = "https://thumbs.dreamstime.com/b/vector-del-logotipo-de-la-hamburguesa-comida-dise%C3%B1o-emblema-plantilla-128946515.jpg",
            categories = listOf("Comida Rápida"),
            menu = listOf(
                Dish(7, "Classic Burger", "Carne jugosa, lechuga fresca, tomate y cebolla.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQYXg32TSOfToAvlI7wwrbYtOSv7IpCJtM_mJIpP_KzsiVLAJMThQpQ2Lg&s=10"),
                Dish(8, "BBQ Burger", "Bacon crocante, aros de cebolla y salsa BBQ ahumada.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSO9Jl0dOVXurIDod6cfc76ZDfdd3SP2h06IsIZAqPP0M_4-Ra7DgW8Vkg&s=10"),
                Dish(104, "Vegg Burger", "Medallón de lentejas con champiñones y rúcula.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2xMJ6E0BCtNfZz8pxjJCC_68lxwLBiMn5Y1at35PeiVaVSPGRxD31jGs&s=10")
            )
        ),
        Restaurant(
            id = 5,
            name = "Pasta House",
            description = "Tradición italiana en cada plato de pasta fresca hecha a mano.",
            imageUrl = "https://picsum.photos/seed/pasta/400/300",
            categories = listOf("Italiana"),
            menu = listOf(
                Dish(9, "Lasagna Tradicional", "Capas de carne boloñesa y bechamel cremosa.", "https://picsum.photos/seed/lasagna/400/300"),
                Dish(10, "Fettuccine Alfredo", "Pasta larga bañada en salsa de crema y parmesano.", "https://picsum.photos/seed/alfredo/400/300"),
                Dish(105, "Gnocchi al Pesto", "Suaves ñoquis de papa con albahaca y piñones.", "https://picsum.photos/seed/gnocchi/400/300")
            )
        ),
        Restaurant(
            id = 6,
            name = "Wok & Roll",
            description = "Fusión de sabores orientales cocinados al fuego del wok.",
            imageUrl = "https://picsum.photos/seed/wok/400/300",
            categories = listOf("Asiática"),
            menu = listOf(
                Dish(11, "Pad Thai", "Fideos de arroz salteados con camarones y maní.", "https://picsum.photos/seed/padthai/400/300"),
                Dish(12, "Ramen Tonkotsu", "Caldo denso de cerdo con fideos y huevo marinado.", "https://picsum.photos/seed/ramen/400/300"),
                Dish(106, "Arroz Chaufa", "Arroz frito al estilo nikkei con pollo y cebollín.", "https://picsum.photos/seed/fried_rice/400/300")
            )
        ),
        Restaurant(
            id = 7,
            name = "Veggie Delight",
            description = "Innovación vegetariana con productos locales y de temporada.",
            imageUrl = "https://picsum.photos/seed/veggie/400/300",
            categories = listOf("Saludable"),
            menu = listOf(
                Dish(13, "Bowl de Quinoa", "Mix de vegetales asados y vinagreta de limón.", "https://picsum.photos/seed/quinoa/400/300"),
                Dish(14, "Tacos de Coliflor", "Coliflor al pastor con piña y cilantro fresco.", "https://picsum.photos/seed/tacosv/400/300"),
                Dish(107, "Risotto de Hongos", "Arroz cremoso con variedad de setas del bosque.", "https://picsum.photos/seed/risotto/400/300")
            )
        ),
        Restaurant(
            id = 8,
            name = "Taco Fiesta",
            description = "El verdadero sabor de México en una experiencia de comida rápida.",
            imageUrl = "https://picsum.photos/seed/taco/400/300",
            categories = listOf("Comida Rápida"),
            menu = listOf(
                Dish(15, "Tacos al Pastor", "Cerdo marinado con especias y piña asada.", "https://picsum.photos/seed/pastor/400/300"),
                Dish(16, "Burrito Supremo", "Tortilla gigante con frijoles, carne y guacamole.", "https://picsum.photos/seed/burrito/400/300"),
                Dish(108, "Enchiladas Verdes", "Tortillas rellenas de pollo con salsa de tomatillo.", "https://picsum.photos/seed/enchiladas/400/300")
            )
        ),
        Restaurant(
            id = 9,
            name = "Osteria Romana",
            description = "Un rincón de Roma con el sabor auténtico de la carbonara original.",
            imageUrl = "https://picsum.photos/seed/osteria/400/300",
            categories = listOf("Italiana"),
            menu = listOf(
                Dish(17, "Pasta Carbonara", "Receta clásica con guanciale, huevo y pecorino.", "https://picsum.photos/seed/carbonara/400/300"),
                Dish(18, "Tiramisú Casero", "Mascarpone, café espresso y bizcochos de Soletilla.", "https://picsum.photos/seed/tiramisu/400/300"),
                Dish(109, "Saltimbocca", "Ternera con jamón serrano y salvia al vino blanco.", "https://picsum.photos/seed/saltimbocca/400/300")
            )
        ),
        Restaurant(
            id = 10,
            name = "Zen Garden",
            description = "Equilibrio y sabor en platos asiáticos balanceados.",
            imageUrl = "https://picsum.photos/seed/zen/400/300",
            categories = listOf("Asiática", "Saludable"),
            menu = listOf(
                Dish(19, "Sopa Miso", "Caldo dashi con tofu, algas wakame y cebollino.", "https://picsum.photos/seed/miso/400/300"),
                Dish(20, "Poke de Atún", "Atún marinado, edamame y pepino sobre arroz.", "https://picsum.photos/seed/poke/400/300"),
                Dish(110, "Tofu Teriyaki", "Dados de tofu fritos con salsa dulce de soja.", "https://picsum.photos/seed/tofu/400/300")
            )
        ),
        Restaurant(
            id = 11,
            name = "Fit Fuel",
            description = "El combustible perfecto para un estilo de vida activo.",
            imageUrl = "https://picsum.photos/seed/fit/400/300",
            categories = listOf("Saludable"),
            menu = listOf(
                Dish(21, "Pollo al Grill", "Pechuga marinada con batata asada y brócoli.", "https://picsum.photos/seed/grill/400/300"),
                Dish(22, "Omelette Fitness", "Claras de huevo con espinaca y pechuga de pavo.", "https://picsum.photos/seed/omelette/400/300"),
                Dish(111, "Açaí Bowl", "Sorbet de açaí con granola artesanal y frutas.", "https://picsum.photos/seed/acai/400/300")
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
