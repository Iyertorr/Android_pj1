package com.example.project_1.view.proyect_3

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class Viemodel2 : ViewModel() {
    var nombre by mutableStateOf("")
    var edad by mutableStateOf("")
    var pass by mutableStateOf("")
    var altura by mutableStateOf("")
    var terminos by mutableStateOf(false)
    var generos by mutableStateOf(listOf("Female", "Male"))
    var genero by mutableStateOf("")

    fun Guardar() {
        print("nombre: $nombre")
        print("edad: $edad")
        print("edad: $pass")
        print("terminos: $terminos")
        print("genero: $genero")
    }
}