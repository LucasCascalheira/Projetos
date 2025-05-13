package com.example.pokedex.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.pokedex.model.samplePokemons

@Composable
fun PokemonDetailScreen(pokemonId: Int) {
    val pokemon = samplePokemons.find { it.id == pokemonId }

    pokemon?.let {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AsyncImage(
                model = it.imageUrl,
                contentDescription = it.name,
                modifier = Modifier.size(128.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text("ID: ${it.id}", style = MaterialTheme.typography.bodyLarge)
            Text("Nome: ${it.name}", style = MaterialTheme.typography.titleLarge)
        }
    } ?: Text("Pokémon não encontrado.")
}