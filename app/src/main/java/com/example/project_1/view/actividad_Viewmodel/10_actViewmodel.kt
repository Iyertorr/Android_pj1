package com.example.project_1.view.actividad_Viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class ViewModel10 : ViewModel() {
    var mensaje by mutableStateOf("Presionar")

    fun botonConDelay() {
        viewModelScope.launch {
            mensaje = "Espera 2 segundos porfavor..."
            delay(2000)
            mensaje = "¡Accion Completada!"
            delay(800)
            mensaje = "Presionar"
        }
    }
}