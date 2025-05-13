package com.example.finalpokedex.ui.theme

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FilterList
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.finalpokedex.model.Pokemon
import com.example.finalpokedex.model.samplePokemons
import com.example.finalpokedex.util.typeColorMap

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PokemonListScreen(navController: NavController) {
    var searchQuery by remember { mutableStateOf("") }
    var selectedType by remember { mutableStateOf<String?>(null) }
    var typeMenuExpanded by remember { mutableStateOf(false) }

    val filteredPokemons = samplePokemons.filter { pokemon ->
        pokemon.name.contains(searchQuery, ignoreCase = true) &&
                (selectedType == null || pokemon.types.contains(selectedType))
    }

    Column(modifier = Modifier.fillMaxSize()) {
        HeaderSection()
        SearchAndFilterSection(
            searchQuery = searchQuery,
            onSearchChange = { searchQuery = it },
            selectedType = selectedType,
            onTypeSelected = {
                selectedType = it
                typeMenuExpanded = false
            },
            typeMenuExpanded = typeMenuExpanded,
            onExpandMenu = { typeMenuExpanded = true },
            onDismissMenu = { typeMenuExpanded = false }
        )
        PokemonGrid(pokemons = filteredPokemons, navController = navController)
    }
}

@Composable
private fun HeaderSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp, bottom = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AsyncImage(
            model = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/items/poke-ball.png",
            contentDescription = "Pokémons",
            modifier = Modifier.size(48.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Pokémons",
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.ExtraBold
        )
    }
}

@Composable
private fun SearchAndFilterSection(
    searchQuery: String,
    onSearchChange: (String) -> Unit,
    selectedType: String?,
    onTypeSelected: (String?) -> Unit,
    typeMenuExpanded: Boolean,
    onExpandMenu: () -> Unit,
    onDismissMenu: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        TextField(
            value = searchQuery,
            onValueChange = onSearchChange,
            label = { Text("Pesquisar") },
            modifier = Modifier.weight(1f)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Box {
            IconButton(onClick = onExpandMenu) {
                Icon(Icons.Default.FilterList, contentDescription = "Filtrar por tipo")
            }
            DropdownMenu(
                expanded = typeMenuExpanded,
                onDismissRequest = onDismissMenu
            ) {
                DropdownMenuItem(
                    text = { Text("Todos os tipos") },
                    onClick = { onTypeSelected(null) }
                )
                typeColorMap.keys.sorted().forEach { type ->
                    DropdownMenuItem(
                        text = { Text(type) },
                        onClick = { onTypeSelected(type) }
                    )
                }
            }
        }
    }
}

@Composable
private fun PokemonGrid(pokemons: List<Pokemon>, navController: NavController) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 4.dp),
        contentPadding = PaddingValues(4.dp)
    ) {
        items(pokemons) { pokemon ->
            PokemonCard(pokemon = pokemon, onClick = {
                navController.navigate("detail/${pokemon.id}")
            })
        }
    }
}

@Composable
private fun PokemonCard(pokemon: Pokemon, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            .clickable { onClick() },
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AsyncImage(
                model = pokemon.imageUrl,
                contentDescription = pokemon.name,
                modifier = Modifier.size(64.dp)
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = pokemon.name,
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(4.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(4.dp),
                modifier = Modifier.fillMaxWidth().height(120.dp)
            ) {
                pokemon.types.forEach { type ->
                    AssistChip(
                        onClick = {},
                        label = { Text(type) },
                        colors = AssistChipDefaults.assistChipColors(
                            containerColor = typeColorMap[type] ?: Color.LightGray
                        ),
                        modifier = Modifier.padding(horizontal = 2.dp)
                    )
                }
            }
        }
    }
}