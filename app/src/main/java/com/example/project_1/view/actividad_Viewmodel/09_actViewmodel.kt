package com.example.project_1.view.actividad_Viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class ViewModel09: ViewModel() {
    var correo by mutableStateOf("")
    var verificarcorreo by mutableStateOf("")

    fun validarcorreo() {
        verificarcorreo = if (correo.contains("@") && correo.contains(".com")) {
            "inicio de sesión exitoso ✔"
        } else {
            "error ❌"
        }
    }


}