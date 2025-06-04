package com.example.project_1.view.actividad_Viewmodel

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun contraseña(viewModel: `05_actViewmodel` = viewModel())
{
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            TextField(
                value = viewModel.passeword,
                onValueChange = {
                    viewModel.passeword = it
                    viewModel.pass()
                },
                placeholder = { Text("Contraseña") }
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Fortaleza de contraseña",
                color = viewModel.textocol
            )
        }
    }



}