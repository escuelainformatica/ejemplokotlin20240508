package cl.eftec.app20240508


import androidx.compose.foundation.layout.Row
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun FilaProducto(navController: NavHostController, prod: String, fila: Int) { // navegacion, nombre producto, id producto
    Row() {
        Text(prod)
        ElevatedButton(onClick = {navController.navigate("pantallaeditar/${fila}") }) {
            Text("editar #${fila}")
        }
    }
}