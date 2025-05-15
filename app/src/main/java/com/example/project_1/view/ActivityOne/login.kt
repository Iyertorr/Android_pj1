package com.example.project_1.view.ActivityOne

import android.R.attr.contentDescription
import android.R.id.input
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project_1.R

@Composable
fun Metaa(){
    Box(
        modifier = Modifier.
        fillMaxSize()

    ){
        Image(
            painter = painterResource(R.drawable.telefono),
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
            .offset(y = (-315).dp)

        )
        {
            Text(" Bibi",
                fontSize = 70.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center)
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .align(Alignment.Center)

                .offset(y = (280).dp))
        {

            Text(
                "Get Started",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
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
                        .border(1.dp, Color.LightGray, CircleShape)

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
                        .background(Color.Blue)
                )
            }
            Spacer(modifier = Modifier.height(30.dp))

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                border = BorderStroke(width = 5.dp, color = Color.Blue)


            )
            {
                Text(
                    text = "Registrate!",
                    fontSize = 30.sp,
                    color = Color.Black,
                    modifier = Modifier.padding(12.dp)
                )
            }
            Spacer(modifier = Modifier.height(26.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "¿Ya tienes cuenta? ",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "Ingresa",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Blue,
                    textAlign = TextAlign.Center
                )
            }



        }
    }
}



