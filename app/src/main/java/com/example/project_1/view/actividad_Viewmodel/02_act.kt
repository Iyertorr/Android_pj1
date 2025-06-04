package com.example.project_1.view.actividad_Viewmodel

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun sesion(viewModel: `02_actViewmodel` = viewModel())
{
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
    )
    {
        Column()
        {
            TextField(
                value = viewModel.correo,
                onValueChange = { viewModel.correo = it },
                placeholder = { Text("correo") }
            )
            Spacer(modifier = Modifier.height(100.dp))

            TextField(
                value = viewModel.contra,
                onValueChange = {viewModel.contra = it },
                placeholder = { Text("contraseña")}

            )

            Button( onClick = {viewModel.validacion()} )
            {

                Text("registro")
            }
            Spacer(modifier = Modifier.height(100.dp))

            Text(viewModel.mensaje)

            }

        }


    }



