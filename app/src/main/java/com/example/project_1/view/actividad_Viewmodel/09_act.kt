package com.example.project_1.view.actividad_Viewmodel

import androidx.compose.material3.*
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.ui.Alignment

@Composable
fun CorreoConIcono(viewModel: ViewModel09 = viewModel()) {
    val correo = viewModel.correo
    val mensaje = viewModel.verificarcorreo
    val esValido = correo.contains("@") && correo.contains(".com") // el ícono necesita una condición booleana, no un texto. por eso utilizamos otra variable
    //para poder que el icono se muestre

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center)
    {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                value = correo,
                onValueChange = {
                    viewModel.correo = it
                    viewModel.validarcorreo()
                },
                label = { Text("Correo electrónico") },
                trailingIcon = {
                    Icon(
                        imageVector = if (esValido) Icons.Default.Check else Icons.Default.Close,
                        contentDescription = null,
                        tint = if (esValido) Color(0xFF4CAF50) else Color.Red // Verde o rojo
                    )
                },
                singleLine = true,
                isError = !esValido && correo.isNotEmpty(),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(8.dp))

            if (correo.isNotEmpty()) {
                Text(
                    text = mensaje,
                    color = if (esValido) Color(0xFF4CAF50) else Color.Red
                )
            }
        }


    }


}