package cl.eftec.app20240508.paginas

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import cl.eftec.app20240508.ScaffoldExample

@Composable
fun pagina1(navController: NavHostController) {
    ScaffoldExample(
        "Listado de productos",
        clickBoton = { navController.navigate("screen2/arg") }
    ) {
        Text("hola")
    }
}