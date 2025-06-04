package com.example.project_1.view.actividad_Viewmodel

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun Campolimite(viewmodel3: ViewModel8 = viewModel()) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        TextField(
            value = viewmodel3.texto,
            onValueChange = { viewmodel3.texto = it },
            label = { Text(
                text = "${viewmodel3.texto.length} / 100",
                color = if (viewmodel3.texto.length > 100) Color.Red else Color.Black
            ) },
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = if (viewmodel3.texto.length > 100) Color.Red else Color.Black,
                unfocusedIndicatorColor = if (viewmodel3.texto.length > 100) Color.Red else Color.Black,
                focusedContainerColor = if (viewmodel3.texto.length > 100) Color.Gray else Color.LightGray
            ),
            modifier = Modifier.fillMaxWidth(0.8f)
        )
    }
}