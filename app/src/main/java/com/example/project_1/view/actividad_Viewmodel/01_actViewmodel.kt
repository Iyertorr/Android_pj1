package com.example.project_1.view.actividad_Viewmodel

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class ViewModel1 : ViewModel() {
    var numer by mutableStateOf(0)

    fun incrementar() {
        numer ++
    }
    fun restar(){
        numer -= 1

    }

}


