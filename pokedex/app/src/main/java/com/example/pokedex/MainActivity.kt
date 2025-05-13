package com.example.pokedex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.navigation.compose.*
import com.example.pokedex.ui.PokemonDetailScreen
import com.example.pokedex.ui.PokemonListScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            MaterialTheme {
                NavHost(navController, startDestination = "list") {
                    composable("list") {
                        PokemonListScreen(navController)
                    }
                    composable("detail/{pokemonId}") { backStackEntry ->
                        val id = backStackEntry.arguments?.getString("pokemonId")?.toIntOrNull() ?: 0
                        PokemonDetailScreen(pokemonId = id)
                    }
                }
            }
        }
    }
}