package com.example.guessnumber

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
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

@Composable
fun GuessTheNumberApp() {
    var targetNumber by remember { mutableStateOf(Random.nextInt(1, 101)) }
    var userInput by remember { mutableStateOf("") }
    var message by remember { mutableStateOf("Adivinhe um número entre 1 e 100") }

    fun checkGuess() {
        val guess = userInput.toIntOrNull()
        message = when {
            guess == null -> "Por favor, insira um número válido"
            guess < targetNumber -> "Tente um número maior"
            guess > targetNumber -> "Tente um número menor"
            else -> {
                val winMessage = "Parabéns! Você acertou! Era $targetNumber"
                targetNumber = Random.nextInt(1, 101) // reinicia o jogo
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
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "🎯 Guess the Number", style = MaterialTheme.typography.headlineSmall)
            Spacer(modifier = Modifier.height(24.dp))
            OutlinedTextField(
                value = userInput,
                onValueChange = { userInput = it },
                label = { Text("Seu palpite") },
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                singleLine = true
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { checkGuess() }) {
                Text("Enviar")
            }
            Spacer(modifier = Modifier.height(24.dp))
            Text(text = message, style = MaterialTheme.typography.bodyLarge)
        }
    }
}