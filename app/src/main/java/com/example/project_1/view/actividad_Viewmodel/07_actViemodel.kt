package com.example.project_1.view.actividad_Viewmodel
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel

class ViewModel07 : ViewModel() {
    private val _tareas = mutableStateListOf(
        "Ir al gimnasio" to false,
        "Estudiar Jetpack Compose" to true,
        "Lavar ropa" to false
    )
    //esta seria la lista

    val tareas = _tareas

    fun actualizarEstado(index: Int, estado: Boolean) { //aqui recibe 2 tipos de datos boolena and Int
        val tarea = _tareas[index]
        _tareas[index] = tarea.first to estado
    }
}