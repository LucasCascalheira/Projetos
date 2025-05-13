package com.example.listas1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.listas1.ui.theme.Listas1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lista(
                itens = listOf("val1", "val2", "val3", "val4"),
                onClick = { item, len ->
                    println("$item tem $len letras")
                }
            )
        }
    }
}

@Composable
fun Lista(
    itens: List<String>,
    onClick: (String, Int) -> Unit
) {
    LazyColumn {
        items(itens) { item ->
            Text(
                text = item,
                modifier = Modifier
                    .clickable { onClick(item, item.length) }
                    .padding(20.dp),
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ListaPreview() {
    Listas1Theme {
        Lista(
            itens = listOf("Preview1", "Preview2"),
            onClick = { _, _ -> }
        )
    }
}