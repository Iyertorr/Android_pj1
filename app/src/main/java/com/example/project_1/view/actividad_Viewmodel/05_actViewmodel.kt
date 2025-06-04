package com.example.project_1.view.actividad_Viewmodel

import androidx. compose. runtime. getValue
import androidx.compose.runtime.mutableStateOf
import androidx. compose. runtime. setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel

class `05_actViewmodel` : ViewModel()
{
    var passeword by mutableStateOf("")
    var textocol by mutableStateOf(Color.Black)



    fun pass(){

        textocol = when{
            passeword.length < 6 ->  Color.Red
            passeword.length < 10 ->  Color.Yellow
            passeword.length >= 10 ->  Color.Green
            else -> Color.Green

        }



    }





}