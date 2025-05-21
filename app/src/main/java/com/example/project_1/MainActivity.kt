package com.example.project_1
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController
import com.example.project_1.ui.theme.Project_1Theme
import com.example.project_1.view.ActivityOne.Segund
import com.example.project_1.view.ActivityOne.Tree
import com.example.project_1.view.ActivityOne.intermedio
import com.example.project_1.view.project_2.navegate
import kotlinx.coroutines.delay


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Project_1Theme {
               //Registro()
                //Horizontal()
                navegate()


            }
        }
    }
}




//@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Horizontal(navController: NavController){
    val pagerState = rememberPagerState(pageCount = {3})
    LaunchedEffect(Unit) {
        while (true){
            delay(3000L)
            val nextPage = (pagerState.currentPage + 1) % 3
            pagerState.animateScrollToPage(nextPage, animationSpec = tween(durationMillis = 600, easing = FastOutSlowInEasing))
            }
       }
    HorizontalPager(state = pagerState){page ->
        when(page){
            0 -> Segund()
            1 -> intermedio()
            2 -> Tree(navController)

            else -> Text("no se encontro")

        }
    }


}
//@Composable
//fun Primeraventana(){
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(color = Color(0xff1adcab)),
//
//    ){
//        Text(text = "hola desde ventana 1",
//                modifier = Modifier.align(Alignment.Center) )
//
//    }
//
//}
//@Composable
//fun Segundaventana(){
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(color = Color(0xff1adcab)),
//
//        ){
//        Text(text = "hola desde ventana 2",
//            modifier = Modifier.align(Alignment.Center) )
//
//    }
//
//}
//@Composable
//fun Terceraventana(){
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(color = Color(0xffc7e80f)),
//
//        ){
//        Text(text = "hola desde ventana 3",
//            modifier = Modifier.align(Alignment.Center) )
//
//    }
//
//}

//fun Body(){
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.SpaceAround
//    ){
//        Image(
//            // R hace referencia a carpeta res, busca la carpeta drawble y la imagen que agregamos como vector assets.
//            painter = painterResource(R.drawable.hola),
//            contentDescription = null
//
//        )
//    }
//}
//
//@Preview(showSystemUi = true, showBackground = true)
//@Composable
//fun GreetingPreview() {
//    Project_1Theme {
//        Registro()
//        }
//}

//@SuppressLint("MutableCollectionMutableState")  /*explicacion mañana */
//@Composable
//
//fun RegisterTex(text: String){
//    var input by remember { mutableStateOf("") }
//    Column(modifier = Modifier.fillMaxSize().padding(54.dp)) {
//        Box(){
//            TextField(
//                value = input,
//                onValueChange = {input = it},
//                label = {
//                    Text(text = "Escibre algo")
//                },
//                placeholder = {
//                    Text(text = "AAAAAAA")
//                }
//            )
//        }
//
//
//        Box(modifier = Modifier.fillMaxHeight(0.5f)
//            .fillMaxWidth()
//            .background(Color.Red)
//        ){
//            Text(
//                text = "HOLA MUNDO",
//                modifier = Modifier.fillMaxSize(),
//                textAlign = TextAlign.Center,
//                color = Color.Blue,
//                fontWeight = FontWeight.Bold
//            )
//
//            Text(text = input, color = Color.White)
//
//            Button(
//                onClick = {
//                    input = "ok"
//                }
//
//            ) {
//                Text(text = "Enviar")
//            }
//        }
//
//        Box(modifier = Modifier.fillMaxHeight(1f)) {
//            Image(modifier = Modifier.fillMaxSize(), painter = painterResource(id = R.drawable.ic_launcher_foreground),
//                contentDescription = "Description")
//        }
//
//    }
//}
//
//1@Composable
//fun mostrarImagen(){
//    Box(modifier = Modifier.fillMaxHeight(1f)) {
//        Image(modifier = Modifier.fillMaxSize(), painter = painterResource(id = R.drawable.ic_launcher_foreground),
//            contentDescription = "Description")
//    }
//}
//
//@Composable
//fun Base(){
////        Column(modifier = Modifier.fillMaxSize(),
////            horizontalAlignment = Alignment.CenterHorizontally) {
////
////            Fila(0.5f)
////
////            Row {Texto("TEXTO EN MEDIO", modifier = Modifier.fillMaxWidth())}
////
////            Fila(fraction = 1f)
////        }
//}
//
//@Composable
//fun Texto(text: String, modifier: Modifier = Modifier) {
//    Text(
//        text = text,
//        modifier = modifier,
//        textAlign = TextAlign.Center
//    )
//}
//
//@Composable
//fun Fila(fraction: Float, modifier: Modifier = Modifier){
//    Row(modifier = Modifier.fillMaxWidth().fillMaxHeight(fraction),
//        horizontalArrangement = Arrangement.Center,
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        Texto("MI texto 3", modifier = Modifier.fillMaxWidth(0.5f))
//        Texto("MI texto 4", modifier = Modifier.fillMaxWidth(1f)) // Ocupa el resto disponible
//    }
//}1



//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}