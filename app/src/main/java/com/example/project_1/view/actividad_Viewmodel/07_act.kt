package com.example.project_1.view.actividad_Viewmodel

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable

fun listaeditable(viewModel7: ViewModel07 = viewModel()) {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {

            viewModel7.tareas.forEachIndexed { index, tarea -> /// perimte recorrer una lista mostrando las pociciones y verificar en qu eindice esta
                //Es útil porque para modificar una tarea en la lista, necesitas su índice.
                val (texto, completada) = tarea // texto (descripccion de la tarea), completada(true o flase)
                val fondo = if (completada)  Color(0xFFD0F0C0) else Color.White // color del dondo del check, la cual se activara si la tarea esta completa


                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.Transparent), // el color defaul del la card de cda uno, como si fuera blaco, un fondo propio
                    elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                ) {
                    Box( //contiene el valor de la card
                        modifier = Modifier
                            .background(fondo) // aplica el color calculado antes // aplica el color verde o blanco
                            .fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier
                                .padding(16.dp)
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(text = texto, modifier = Modifier.weight(1f)) // weigth(1 )hace que el texto use
                            Checkbox( // esta ligado al estado actual de (compelatdo)
                                checked = completada,
                                onCheckedChange = { viewModel7.actualizarEstado(index, it) } // marca y desmarca, la cual actualiza si esta completado o no
                            )

                            //cuando se cambia el checkbox llama el actaulizarestado que es donde esta el viewmodel
                        }
                    }
                }

            }
        }
    }
}