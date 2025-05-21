package com.example.project_1.view.project_2

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun Sesion(navController: NavHostController){
    var input by remember { mutableStateOf("") }
    var input2 by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 200.dp),
        contentAlignment = Alignment.TopCenter
    ) {
        Box(
            modifier = Modifier.fillMaxHeight(),
            contentAlignment = Alignment.Center
        ) {
            Column(modifier = Modifier.align(Alignment.Center).offset(y = (-410).dp)) {
                Text(
                    "Inicio de sesion", fontSize = 50.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(2.dp))

            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TextField(
                    value = input,
                    onValueChange = { input = it },
                    label = { Text(text = "Contraseña") },
                    placeholder = { Text(text = "Ingresa contraseña") }
                )

                Spacer(modifier = Modifier.height(110.dp))

                TextField(
                    value = input2,
                    onValueChange = { input2 = it },
                    label = { Text(text = "Correo") },
                    placeholder = { Text(text = "ingresa correo") }
                )
                Spacer(modifier = Modifier.height(120.dp))

                OutlinedButton(
                    onClick = { navController.navigate("destalles") },
                    border = BorderStroke(2.dp, Color.Blue),
                    colors = ButtonDefaults.outlinedButtonColors(containerColor = Color.White)
                ) {
                    Text("Inicia sesion", fontSize = 20.sp, color = Color.Blue)
                }

            }
        }


    }

}