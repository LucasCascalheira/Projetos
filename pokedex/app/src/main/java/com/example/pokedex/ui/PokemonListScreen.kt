package com.example.pokedex.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.pokedex.model.samplePokemons

@Composable
fun PokemonListScreen(navController: NavController) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(samplePokemons) { pokemon ->
            Card(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
                    .clickable { navController.navigate("detail/${pokemon.id}") }
            ) {
                Row(modifier = Modifier.padding(16.dp)) {
                    AsyncImage(
                        model = pokemon.imageUrl,
                        contentDescription = pokemon.name,
                        modifier = Modifier.size(64.dp)
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    Text(text = pokemon.name, style = MaterialTheme.typography.titleMedium)
                }
            }
        }
    }
}