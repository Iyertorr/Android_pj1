import android.widget.NumberPicker
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.project_1.view.proyect_3.Viemodel2

@Composable
fun Formulario(viewModel: Viemodel2 = viewModel()) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column {
            OutlinedTextField(
                value = viewModel.nombre,
                onValueChange = { viewModel.nombre = it },
                label = { Text("Ingrese su nombre") }
            )
            OutlinedTextField(
                value = viewModel.edad,
                onValueChange = { viewModel.edad = it },
                label = { Text("Ingrese su edad") }
            )

            OutlinedTextField(
                value =viewModel.pass,
                onValueChange = { viewModel.pass = it },
                label = {Text("password")},
                singleLine = true,
                visualTransformation = PasswordVisualTransformation()
            )
            Text("altura" )
//            Slider(
//                value = viewModel.altura.toFloat(),
//                onValueChange = {viewModel.altura = it.toFloat()},
//                valueRange = 0f .. 2.30f,
//                steps = 200,
//                modifier = Modifier.fillMaxWidth()
//            )
            Text(viewModel.altura.toString())


            Text("acepto terminso y condiciones ")
            Checkbox(checked = viewModel.terminos,
                onCheckedChange = {viewModel.terminos = it})

            Text("genero")

            repeat(viewModel.generos.size){
                RadioButton(selected = viewModel.genero == viewModel.generos[it],
                    onClick = { viewModel.genero = viewModel.generos[it]})
                Text(viewModel.generos[it])
            }




            Button(
                onClick = { viewModel.Guardar() }
            ) {
                Text(text = "Guardar Datos")
               }



            Button(onClick = { viewModel.Guardar() }) {
                Text("Guardar")
            }
        }
    }
}
