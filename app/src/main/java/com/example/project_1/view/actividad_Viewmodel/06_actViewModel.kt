package com.example.project_1.view.actividad_Viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel

class `06_Viewmodel` : ViewModel() {
    var Nombre by mutableStateOf("")
    var Correo by mutableStateOf("")
    var Contrasena by mutableStateOf("")
    var ValContrasena by mutableStateOf("")
    var validacion by mutableStateOf(true)
    val borderWidht: Dp
        get() = if (validacion == false) 5.dp else 0.dp
    val borderColor: Color
        get() = if (validacion == false) Color.Red else Color.White

    fun ValidarDatos() {
        validacion = if (
            Nombre.isEmpty() == false &&
            Correo.contains("@") &&
            Correo.contains(".") &&
            Contrasena == ValContrasena
        ) {
            true
        } else {
            false
        }
    }
}