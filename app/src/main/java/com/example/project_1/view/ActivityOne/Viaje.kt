package com.example.project_1.view.ActivityOne
import android.R.id.input
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project_1.R
import com.example.project_1.Texto

@Composable

fun Registro(){

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.drawable.mujerlado),
            contentDescription = null,
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth(0.8f)
                .align(Alignment.Center)
                .offset(y = (-30).dp)
        )
        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .offset(y = (-290).dp)
        ) {
            Text(
                "bibi",
                fontSize = 70.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        }
        Column(
            modifier = Modifier
            .align(Alignment.Center)

            .offset(y = (270).dp))
        {
            Text(
                "for students who want to become fligth attendants",
                fontSize = 20.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center)
            Spacer(modifier = Modifier.height(40.dp))

            Text("Communicate whit flight attendattes, meet find out userful information" +
                    "that will help you fulfill your dream"
                ,fontSize = 20.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center, color = Color.Gray

            )
            Spacer(modifier = Modifier.height(40.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {

                Box(
                    modifier = Modifier
                        .size(12.dp)
                        .clip(CircleShape)
                        .background(Color.Blue)


                )

                Spacer(modifier = Modifier.width(8.dp))


                Box(
                    modifier = Modifier
                        .size(12.dp)
                        .clip(CircleShape)
                        .border(1.dp, Color.LightGray, CircleShape)
                )

                Spacer(modifier = Modifier.width(8.dp))


                Box(
                    modifier = Modifier
                        .size(12.dp)
                        .clip(CircleShape)
                        .border(1.dp, Color.LightGray, CircleShape)

                )
            }

       }





    }








}

