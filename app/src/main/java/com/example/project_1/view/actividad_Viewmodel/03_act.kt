package com.example.project_1.view.actividad_Viewmodel

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun PantallaTelefono(viewModel: `03_Viewmodel` = viewModel()) {

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center)
    {
        TextField(
            value = viewModel.telefono,
            onValueChange = { nuevoValor ->
                if (nuevoValor.all { it.isDigit() }) { //all :
                    viewModel.telefono = nuevoValor
                }
            },
            placeholder = { Text("Teléfono") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number,  //keyboard
            )
        )
        Spacer(modifier = Modifier.height(100.dp))

        Button(
            onClick = {  },
            modifier = Modifier
                .offset(y = 130.dp)
                .background(
                    if (viewModel.telefono.length == 10 && viewModel.telefono.all { it.isDigit() }) {
                        Color.Green
                    } else {
                        Color.Red
                    }
                )
        ) {
            Text("Validar")
        }

    }


}

