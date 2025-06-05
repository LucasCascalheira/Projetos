package com.example.guessthenumber_listas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GuessTheNumberApp()
        }
    }
}

data class GameResult(val attempts: Int, val number: Int)

@Composable
fun GuessTheNumberApp() {
    var targetNumber by remember { mutableStateOf(Random.nextInt(1, 101)) }
    var userInput by remember { mutableStateOf("") }
    var message by remember { mutableStateOf("Adivinhe um número entre 1 e 100") }
    var attemptCount by remember { mutableStateOf(0) }
    var ranking by remember { mutableStateOf(listOf<GameResult>()) }

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
                val winMessage = "Parabéns! Você acertou em $attemptCount tentativa(s)! Era $targetNumber"
                // Adiciona ao ranking e ordena
                ranking = (ranking + GameResult(attemptCount, targetNumber)).sortedBy { it.attempts }

                // Reinicia jogo
                targetNumber = Random.nextInt(1, 101)
                attemptCount = 0
                userInput = ""
                winMessage
            }
        }
    }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "🎯 Guess the Number", style = MaterialTheme.typography.headlineSmall)
            Spacer(modifier = Modifier.height(16.dp))
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
            Text(text = message, style = MaterialTheme.typography.bodyLarge)
            Spacer(modifier = Modifier.height(24.dp))

            if (ranking.isNotEmpty()) {
                Text("🏆 Ranking das Melhores Partidas", style = MaterialTheme.typography.titleMedium)
                Spacer(modifier = Modifier.height(8.dp))
                LazyColumn(
                    modifier = Modifier.fillMaxWidth().heightIn(max = 200.dp)
                ) {
                    items(ranking) { result ->
                        Text("✔️ ${result.attempts} tentativa(s) - Número: ${result.number}")
                    }
                }
            }
        }
    }
}