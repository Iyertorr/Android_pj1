package com.example.project_1.view.proyect_3

import android.R
import android.content.res.Configuration

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
@Composable
fun Orientacion(): Boolean {
    val configuration = LocalConfiguration.current
    return when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> true

        Configuration.ORIENTATION_PORTRAIT -> false
        else -> true
    }
}


@Composable
fun Vista1(navController: NavController){

    //var data = remember { mutableStateOf("") }
    var data = rememberSaveable { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize().padding(30.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Hola mundo desde vista1")

        TextField(
            value = data.value,
            onValueChange = {value -> data.value = value},
            label = { Text("Nombre") },
        )

        Button(
            modifier = Modifier.fillMaxWidth().height(50.dp),
            onClick = {
                navController.navigate("vista2/${data.value}")
            },
        ) { Text("Navegar a vista2",
            color = if (Orientacion()) Color.Red else Color.Green) }
    }
}