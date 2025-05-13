package com.example.pokedex.model

data class Pokemon(
    val id: Int,
    val name: String,
    val imageUrl: String
)

val samplePokemons = listOf(
    Pokemon(1, "Bulbasaur", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png"),
    Pokemon(4, "Charmander", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/4.png"),
    Pokemon(7, "Squirtle", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/7.png")
)