package com.example.project_1.view.actividad_Viewmodel

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun validacionderegistro(viewmodel6:`06_Viewmodel` = viewModel()) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column {
            TextField(
                value = viewmodel6.Nombre,
                onValueChange = { viewmodel6.Nombre = it },
                label = {
                    if (viewmodel6.validacion == false) Text(text = "Este campo no puede ir vacio") else Text(
                        text = "Ingrese su nombre"
                    )
                },
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Next
                ),
                modifier = Modifier
                    .fillMaxWidth(if (viewmodel6.validacion == false) 0.8f else 0.5f)
                    .clip(shape = CircleShape)
                    .border(viewmodel6.borderWidht, viewmodel6.borderColor, shape = CircleShape)
                    .padding(6.dp)
            )
            Spacer(modifier = Modifier
                .fillMaxWidth(0.5f)
                .padding(20.dp))
            TextField(
                value = viewmodel6.Correo,
                onValueChange = { viewmodel6.Correo = it },
                label = {
                    if (viewmodel6.validacion == false) Text(text = "El email de contener un '@' y un '.'") else Text(
                        text = "Ingrese su correo"
                    )
                },
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Next
                ),
                modifier = Modifier
                    .fillMaxWidth(if (viewmodel6.validacion == false) 0.8f else 0.5f)
                    .clip(shape = CircleShape)
                    .border(viewmodel6.borderWidht, viewmodel6.borderColor, shape = CircleShape)
                    .padding(6.dp)
            )
            Spacer(modifier = Modifier
                .fillMaxWidth(0.5f)
                .padding(20.dp))
            TextField(
                value = viewmodel6.Contrasena,
                onValueChange = { viewmodel6.Contrasena = it },
                label = {
                    if (viewmodel6.validacion == false) Text(text = "Esta contraseña debe coincidir con la siguiente") else Text(
                        text = "Ingrese su contrasena"
                    )
                },
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password
                ),
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier
                    .fillMaxWidth(if (viewmodel6.validacion == false) 0.8f else 0.5f)
                    .clip(shape = CircleShape)
                    .border(viewmodel6.borderWidht, viewmodel6.borderColor, shape = CircleShape)
                    .padding(6.dp)
            )
            Spacer(modifier = Modifier
                .fillMaxWidth(0.5f)
                .padding(20.dp))
            TextField(
                value = viewmodel6.ValContrasena,
                onValueChange = { viewmodel6.ValContrasena = it },
                label = {
                    if (viewmodel6.validacion == false) Text(text = "Esta campo debe ser identico al anterior") else Text(
                        text = "Ingrese su contrasena"
                    )
                },
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password
                ),
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier
                    .fillMaxWidth(if (viewmodel6.validacion == false) 0.8f else 0.5f)
                    .clip(shape = CircleShape)
                    .border(viewmodel6.borderWidht, viewmodel6.borderColor, shape = CircleShape)
                    .padding(6.dp)
            )
            Spacer(modifier = Modifier
                .fillMaxWidth(0.5f)
                .padding(20.dp))
            Button(
                onClick = { viewmodel6.ValidarDatos() },
                modifier = Modifier.fillMaxWidth(0.5f)
            ) {
                Text(text = "Registrar")
            }
        }
    }
}