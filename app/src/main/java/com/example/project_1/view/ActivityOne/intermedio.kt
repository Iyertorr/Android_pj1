package com.example.project_1.view.ActivityOne

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project_1.R

@Composable

fun intermedio (){

    Box(
        modifier = Modifier
            .fillMaxSize()
    )
    {
        Image(
            painter = painterResource(R.drawable.mujermira),
            contentDescription = null,
            modifier = Modifier.align(Alignment.Center).padding(60.dp).
            offset(y = -50.dp)



        )
        Column(
            modifier = Modifier.fillMaxHeight().
            align(Alignment.Center).
            offset(y = 100.dp)



        ) {
            Text("bibi",
                fontSize = 60.sp,
                fontWeight = FontWeight.Bold,

                )


        }

        Column (
            modifier = Modifier.fillMaxHeight().
            align(Alignment.Center).
            offset(y = 600.dp)


        ) {
            Text("for cabin crew who want"+
                    "to train students ",
                fontSize = 20.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center

                )
            Spacer(modifier = Modifier.height(40.dp))
            Text("Share your knowledge whit students recluids students and " +
                    "earn money on it"
                ,fontSize = 20.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center, color = Color.Gray

            )



        }

        Column(modifier = Modifier.align(Alignment.Center).offset(y = (780).dp)) {

            navegacion(1)
        }



    }




}