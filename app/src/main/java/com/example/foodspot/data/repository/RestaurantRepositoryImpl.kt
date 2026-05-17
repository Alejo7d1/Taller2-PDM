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
            name = "Parlottini",
            description = "Tradición italiana en cada plato de pasta fresca hecha a mano.",
            imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR2y03p-XRpiB-NDeS1Je-cYXoslJs9pSmWW99IlhQaKIOCYEtcGxDc0Ls&s=10",
            categories = listOf("Italiana"),
            menu = listOf(
                Dish(9, "Lasagna Tradicional", "Capas de carne boloñesa y bechamel cremosa.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZvdyc8rlf8d-yfp-4LpkZ1lw0YQDg6NcOu-BENNKgc-v3PsmVLAW5CRWE&s=10"),
                Dish(10, "Fettuccine Alfredo", "Pasta larga bañada en salsa de crema y parmesano.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRMjfCcRWWZzoQTerIlVDuz8Na0q6ZFggPJEccpak0uTg&s=10"),
                Dish(105, "Gnocchi al Pesto", "Suaves ñoquis de papa con albahaca y piñones.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQqlCdarSxyYZv6_Pj0ehDY430jwH78C7Va4blf0hHCiw&s=10")
            )
        ),
        Restaurant(
            id = 6,
            name = "Woki & Rolli",
            description = "Fusión de sabores orientales cocinados al fuego del wok.",
            imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSg8UaHDJq6Sm0XTuG5N2KzjBeBwsDv14y67MRyjGOcMg&s=10",
            categories = listOf("Asiática"),
            menu = listOf(
                Dish(11, "Pad Thai", "Fideos de arroz salteados con camarones y maní.", "https://cdn7.kiwilimon.com/brightcove/10023/640x640/10023.jpg.webp"),
                Dish(12, "Ramen Tonkotsu", "Caldo denso de cerdo con fideos y huevo marinado.", "https://cdn7.kiwilimon.com/brightcove/10023/640x640/10023.jpg.webp"),
                Dish(106, "Arroz Chaufa", "Arroz frito al estilo nikkei con pollo y cebollín.", "https://cdn7.kiwilimon.com/brightcove/10023/640x640/10023.jpg.webp")
            )
        ),
        Restaurant(
            id = 7,
            name = "Veggie Delight",
            description = "Innovación vegetariana con productos locales y de temporada.",
            imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTGiapsIsLEM6zFAVQaWyEpTqkzg5JQ8ozmVjbgaacxOEagZzot1Y-rK4s&s=10",
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
            imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDssbQdJGYt6T8gtM0Ympcrz3C9UG55EBL9mn1VIjweMaZQc2B4ZvLa5Y&s=10",
            categories = listOf("Comida Rápida"),
            menu = listOf(
                Dish(15, "Tacos al Pastor", "Cerdo marinado con especias y piña asada.", "https://www.thecookierookie.com/wp-content/uploads/2024/05/street-tacos-recipe-2.jpg"),
                Dish(16, "Burrito Supremo", "Tortilla gigante con frijoles, carne y guacamole.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQpxWNlQVMYZgcgp7VsFXougRXc1H9Kw6u3aUvPgi5_Pah8hm7QaZRfwHw&s=10"),
                Dish(108, "Enchiladas Verdes", "Tortillas rellenas de pollo con salsa de tomatillo.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQpxWNlQVMYZgcgp7VsFXougRXc1H9Kw6u3aUvPgi5_Pah8hm7QaZRfwHw&s=10")
            )
        ),
        Restaurant(
            id = 9,
            name = "Cesar Romanof",
            description = "Un rincón de Roma con el sabor auténtico de la carbonara original.",
            imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQeBaVjMQUQXRq2cZe55uWejfFBKNwjuYwGI_ESO9vNI2lvLNXhD9fLfjEe&s=10",
            categories = listOf("Italiana"),
            menu = listOf(
                Dish(17, "Pasta Carbonara", "Receta clásica con guanciale, huevo y pecorino.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQpraHpL41Vo0icW2FSmqXV3k6FeeUrN8ZlwUAFW5jkQpI0i2BpTE-_ixuP&s=10"),
                Dish(18, "Tiramisú Casero", "Mascarpone, café espresso y bizcochos de Soletilla.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQpraHpL41Vo0icW2FSmqXV3k6FeeUrN8ZlwUAFW5jkQpI0i2BpTE-_ixuP&s=10"),
                Dish(109, "Saltimbocca", "Ternera con jamón serrano y salvia al vino blanco.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQpraHpL41Vo0icW2FSmqXV3k6FeeUrN8ZlwUAFW5jkQpI0i2BpTE-_ixuP&s=10")
            )
        ),
        Restaurant(
            id = 10,
            name = "Zen Garden",
            description = "Equilibrio y sabor en platos asiáticos balanceados.",
            imageUrl = "https://cdn.shopify.com/s/files/1/0558/6413/1764/files/10_Tips_To_Create_A_Good_Asian_Food_Logo_Design_13_1024x1024.png?v=1664427994",
            categories = listOf("Asiática", "Saludable"),
            menu = listOf(
                Dish(19, "Sopa Miso", "Caldo dashi con tofu, algas wakame y cebollino.", "https://bffasiangrill.com/wp-content/uploads/2019/12/pho-recipe.jpg"),
                Dish(20, "Poke de Atún", "Atún marinado, edamame y pepino sobre arroz.", "https://bffasiangrill.com/wp-content/uploads/2019/12/pho-recipe.jpg"),
                Dish(110, "Tofu Teriyaki", "Dados de tofu fritos con salsa dulce de soja.", "https://bffasiangrill.com/wp-content/uploads/2019/12/pho-recipe.jpg")
            )
        ),
        Restaurant(
            id = 11,
            name = "Bamboo Wok",
            description = "Sabores del este: wok al momento, noodles y platos tradicionales asiáticos con toque moderno.",
            imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQuu1_qu5PwVMfO-KIdmOrEEYpI5l13MkMNLFBQBfBUG_pZP0cLWPuQJrw&s=10",
            categories = listOf("Asiática"),
            menu = listOf(
                Dish(21, "Pollo Teriyaki", "Tiras de pollo glaseadas en salsa teriyaki, servidas con arroz jazmín.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRHYfpdJz4t9QttpQs4yV9WxS0e6HycHxoZhpjCI6msxsoOe-l6iY7tTKuK&s=10"),
                Dish(22, "Pad Thai", "Fideos de arroz salteados con camarón, tofu, cacahuate y brotes de soja.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4x6I6UOdGhTdq0PxU6V1U8gTPPu-zli86hgpriGADMar3msWveeQ6X4U&s=10"),
                Dish(111, "Mango Sticky Rice", "Arroz glutinoso con leche de coco y mango fresco, postre tradicional tailandés.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR2zaVKTOZ0tsMrkjiZqnZ2fiPomioulp2PiI9NDI6WpLx1zJS-q4_zcn4&s=10")
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
