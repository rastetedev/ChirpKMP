package com.raulastete.core.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

expect fun platform(): String


@Composable
fun Greeting(name: String) {
    Scaffold {
        Column {
            Text(text = "Hello $name!")
            Icon(imageVector = Icons.Default.Add, contentDescription = null)
        }
    }
}