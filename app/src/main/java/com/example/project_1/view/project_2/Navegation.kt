package com.example.project_1.view.project_2

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.project_1.Horizontal

@Composable

fun navegate(){
    val navController  = rememberNavController()

    NavHost(navController = navController,
        startDestination = "Home")
    {
        composable("Home"){
            Horizontal(navController)
        }
        composable("Registro"){
            Registro(navController)
        }
        composable ("login"){
            Sesion(navController)
        }
        composable ("destalles"){
            destalles(navController)
        }


    }

}