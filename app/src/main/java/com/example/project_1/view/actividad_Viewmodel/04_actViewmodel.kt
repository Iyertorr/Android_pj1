package com.example.project_1.view.actividad_Viewmodel

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class  `04_actViewmodel`: ViewModel() {
    var isDarckTheme by mutableStateOf(false)
    val colorScheme by derivedStateOf {
        if (isDarckTheme) darkColorScheme() else lightColorScheme()
    }
}