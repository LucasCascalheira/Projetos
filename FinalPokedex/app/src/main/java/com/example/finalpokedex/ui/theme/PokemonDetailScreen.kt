package com.example.finalpokedex.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.finalpokedex.model.samplePokemons
import com.example.finalpokedex.util.typeColorMap

@Composable
fun PokemonDetailScreen(pokemonId: Int) {
    val pokemon = samplePokemons.find { it.id == pokemonId }

    if (pokemon != null) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(22.dp), // 16.dp + 3.dp
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AsyncImage(
                model = pokemon.imageUrl,
                contentDescription = pokemon.name,
                modifier = Modifier.size(188.dp) // 180.dp + 3.dp
            )
            Spacer(modifier = Modifier.height(18.dp)) // 12.dp + 3.dp

            Text("Nº ${pokemon.id}", style = MaterialTheme.typography.bodyMedium)
            Text(
                pokemon.name,
                style = MaterialTheme.typography.bodySmall.copy(fontSize = 20.sp),
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(15.dp)) // 8.dp + 3.dp

            Row(
                horizontalArrangement = Arrangement.spacedBy(15.dp) // 8.dp + 3.dp
            ) {
                pokemon.types.forEach { type ->
                    AssistChip(
                        onClick = {},
                        label = { Text(type, style = MaterialTheme.typography.bodySmall) },
                        colors = AssistChipDefaults.assistChipColors(
                            containerColor = typeColorMap[type] ?: MaterialTheme.colorScheme.surfaceVariant
                        )
                    )
                }
            }

            Spacer(modifier = Modifier.height(18.dp)) // 12.dp + 3.dp

            Text(
                text = pokemon.description,
                style = MaterialTheme.typography.bodySmall.copy(fontSize = 20.sp),
                modifier = Modifier.padding(horizontal = 15.dp) // 8.dp + 3.dp
            )

            // Evoluções
            if (pokemon.evolutions.isNotEmpty()) {
                Spacer(modifier = Modifier.height(26.dp)) // 20.dp + 3.dp
                Text("Evoluções:", style = MaterialTheme.typography.bodySmall.copy(fontSize = 20.sp))
                Spacer(modifier = Modifier.height(15.dp)) // 8.dp + 3.dp

                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(24.dp), // 16.dp + 3.dp
                    contentPadding = PaddingValues(horizontal = 15.dp) // 8.dp + 3.dp
                ) {
                    items(pokemon.evolutions) { evoName ->
                        val evolvedPokemon = samplePokemons.find { it.name == evoName }
                        if (evolvedPokemon != null) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.width(98.dp) // 90.dp + 3.dp
                            ) {
                                AsyncImage(
                                    model = evolvedPokemon.imageUrl,
                                    contentDescription = evolvedPokemon.name,
                                    modifier = Modifier.size(150.dp) // 80.dp + 3.dp
                                )
                                Text(
                                    text = evolvedPokemon.name,
                                    style = MaterialTheme.typography.bodySmall.copy(fontSize = 20.sp),
                                    fontWeight = FontWeight.SemiBold
                                )
                            }
                        } else {
                            Text("- $evoName", style = MaterialTheme.typography.bodySmall)
                        }
                    }
                }
            }
        }
    } else {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(19.dp), // 16.dp + 3.dp
            contentAlignment = Alignment.Center
        ) {
            Text("Pokémon não encontrado.", style = MaterialTheme.typography.bodyMedium)
        }
    }
}