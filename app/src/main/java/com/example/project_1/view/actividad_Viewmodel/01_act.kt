package com.example.project_1.view.actividad_Viewmodel

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel


@Composable

fun contador(viewModel : ViewModel1 = viewModel())
{
    Box(modifier = Modifier.fillMaxSize(),contentAlignment
    = Alignment.Center){

        Text("numero ${viewModel.numer}",
            modifier = Modifier.background(if (viewModel.numer  % 2==0)Color.Green else Color.Red))
        Spacer(modifier = Modifier.height(110.dp))

        Button(
            onClick = {viewModel.incrementar()},
            modifier = Modifier.offset(y = 60.dp )

        ) {
            Text("sumar")
        }
        Spacer(modifier = Modifier.height(27.dp))
        Button(
            onClick = {viewModel.restar()},
            modifier = Modifier.offset(y = 100.dp)
        ) {
            Text("restar")
        }


    }







    }







