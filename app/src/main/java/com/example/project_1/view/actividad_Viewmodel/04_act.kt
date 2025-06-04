package com.example.project_1.view.actividad_Viewmodel

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun Claroyoscuro(viewmodel3: `04_actViewmodel` = viewModel()) {
    // var colorScheme = if (viewmodel3.isDarckTheme) darkColorScheme() else lightColorScheme()
    MaterialTheme(
        colorScheme = viewmodel3.colorScheme
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(colorScheme.background),
            contentAlignment = Alignment.Center
        ) {
            Column {
                Text(text = "Bienvenidos, Presione el boton.",color = Color(if(viewmodel3.isDarckTheme == true) 0xFFffffff else 0xFF000000))
                Button(
                    modifier = Modifier.background(colorScheme.primary),
                    onClick = { viewmodel3.isDarckTheme = !viewmodel3.isDarckTheme }
                ) {
                    Text(
                        text = "Cambiar tema."
                    )
                }
            }
        }
    }
}