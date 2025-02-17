package cl.eftec.app20240508.paginas

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import cl.eftec.app20240508.FilaProducto
import cl.eftec.app20240508.ProductoVM
import cl.eftec.app20240508.ScaffoldExample

@Composable
fun pagina1(navController: NavHostController, productoVM: ProductoVM) {
    ScaffoldExample(
        "Listado de productos",
        clickBoton = { navController.navigate("screen2/arg") }
    ) {
        var fila=0;
        for(prod in productoVM.productos) {
            FilaProducto(navController,prod,fila)
            fila++;
        }
    }
}