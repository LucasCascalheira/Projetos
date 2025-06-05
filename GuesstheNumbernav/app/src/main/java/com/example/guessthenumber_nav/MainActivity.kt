package com.example.guessthenumber_nav

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.*
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GuessTheNumberApp()
        }
    }
}

data class GameResult(val player: String, val attempts: Int, val number: Int)

@Composable
fun GuessTheNumberApp() {
    val navController = rememberNavController()
    val ranking = remember { mutableStateListOf<GameResult>() }

    NavHost(navController = navController, startDestination = "welcome") {
        composable("welcome") { WelcomeScreen(navController) }
        composable("name_input") { NameInputScreen(navController) }
        composable("game/{playerName}") { backStackEntry ->
            val playerName = backStackEntry.arguments?.getString("playerName") ?: "Jogador"
            GameScreen(playerName, ranking, navController)
        }
        composable("ranking") { RankingScreen(ranking, navController) }
    }
}

@Composable
fun WelcomeScreen(navController: NavController) {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize().padding(16.dp)
        ) {
            Text("🎯 Guess the Number", style = MaterialTheme.typography.headlineLarge)
            Spacer(modifier = Modifier.height(32.dp))
            Button(onClick = { navController.navigate("name_input") }, modifier = Modifier.fillMaxWidth()) {
                Text("Novo Jogo")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { navController.navigate("ranking") }, modifier = Modifier.fillMaxWidth()) {
                Text("Rankings")
            }
        }
    }
}

@Composable
fun NameInputScreen(navController: NavController) {
    var playerName by remember { mutableStateOf("") }

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize().padding(16.dp)
        ) {
            Text("Digite seu nome", style = MaterialTheme.typography.titleLarge)
            Spacer(modifier = Modifier.height(16.dp))
            OutlinedTextField(
                value = playerName,
                onValueChange = { playerName = it },
                label = { Text("Nome do jogador") },
                singleLine = true
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = { navController.navigate("game/${playerName.trim()}") },
                enabled = playerName.isNotBlank()
            ) {
                Text("Começar")
            }
        }
    }
}

@Composable
fun GameScreen(playerName: String, ranking: MutableList<GameResult>, navController: NavController) {
    var targetNumber by remember { mutableStateOf(Random.nextInt(1, 101)) }
    var userInput by remember { mutableStateOf("") }
    var message by remember { mutableStateOf("Adivinhe um número entre 1 e 100") }
    var attemptCount by remember { mutableStateOf(0) }

    fun checkGuess() {
        val guess = userInput.toIntOrNull()
        if (guess == null) {
            message = "Por favor, insira um número válido"
            return
        }

        attemptCount++

        message = when {
            guess < targetNumber -> "Tente um número maior"
            guess > targetNumber -> "Tente um número menor"
            else -> {
                val msg = "Parabéns $playerName! Você acertou em $attemptCount tentativa(s). Era $targetNumber"
                ranking.add(GameResult(playerName, attemptCount, targetNumber))
                ranking.sortBy { it.attempts }
                attemptCount = 0
                targetNumber = Random.nextInt(1, 101)
                msg
            }
        }
        userInput = ""
    }

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier.padding(16.dp).fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Jogador: $playerName", style = MaterialTheme.typography.titleMedium)
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                value = userInput,
                onValueChange = { userInput = it },
                label = { Text("Seu palpite") },
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                singleLine = true
            )
            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = { checkGuess() }) {
                Text("Enviar")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(message, style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(24.dp))
            Button(onClick = { navController.popBackStack("welcome", inclusive = false) }) {
                Text("Voltar ao Início")
            }
        }
    }
}

@Composable
fun RankingScreen(ranking: List<GameResult>, navController: NavController) {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text("🏆 Rankings", style = MaterialTheme.typography.headlineSmall)
            Spacer(modifier = Modifier.height(16.dp))
            if (ranking.isEmpty()) {
                Text("Nenhum jogo registrado ainda.")
            } else {
                LazyColumn {
                    items(ranking) { result ->
                        Text("👤 ${result.player} - ${result.attempts} tentativa(s) - Número: ${result.number}")
                    }
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
            Button(onClick = { navController.popBackStack() }) {
                Text("Voltar")
            }
        }
    }
}