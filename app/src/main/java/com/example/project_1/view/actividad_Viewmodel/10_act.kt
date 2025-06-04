package com.example.project_1.view.actividad_Viewmodel

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun BotonCarga(viewmodel3: ViewModel10 = viewModel()) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        if (viewmodel3.mensaje == "Presionar"){
            Button(
                onClick = { viewmodel3.botonConDelay() }
            ) {
                Text(text = viewmodel3.mensaje)
            }
        } else if (viewmodel3.mensaje == "Espera 2 segundos porfavor..."){
            TextButton(
                onClick = { "" }
            ) {
                Text(text = viewmodel3.mensaje)
            }
        } else if (viewmodel3.mensaje == "¡Accion Completada!"){
            TextButton(
                onClick = { "" }
            ) {
                Text(text = viewmodel3.mensaje)
            }
        }
    }
}