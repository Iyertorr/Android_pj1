package com.example.project_1.view.actividad_Viewmodel

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class `02_actViewmodel` : ViewModel() {
    var correo by mutableStateOf("")
    var contra by mutableStateOf("")
    var mensaje by mutableStateOf("")

    fun validacion(){
        mensaje = if( correo.contains("@") && (correo.contains(".com"))
            && contra.length == 6 && contra.isEmpty() == false ){
           ("inico se secion exitoso")
        }
        else
             "error"
    }
}