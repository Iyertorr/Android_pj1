package com.example.project_1.view.ActivityOne

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
@Composable
fun navegacion(activeIndex: Int){
    Row(
        modifier = Modifier.
        fillMaxSize().
        padding(vertical = 60.dp, horizontal = 30.dp),horizontalArrangement = Arrangement.Center
    ){
        repeat (3){i ->
            Box(
                modifier = Modifier.size(10.dp).padding(horizontal = 2.dp).
                background(if(activeIndex== i) Color.Blue else Color.
                Red.copy(alpha = 0.5f), shape = CircleShape)
            )

        }

    }
}
