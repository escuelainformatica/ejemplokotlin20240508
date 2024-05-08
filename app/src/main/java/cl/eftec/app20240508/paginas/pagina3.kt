package cl.eftec.app20240508.paginas

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import cl.eftec.app20240508.ProductoVM
import cl.eftec.app20240508.ScaffoldExample

@Composable
fun pagina3(navController: NavHostController, productoVM: ProductoVM, name: String) {
        productoVM.producto=productoVM.productos[name.toInt()]
        ScaffoldExample("editar producto", clickBoton = {
        productoVM.editar(name.toInt())
        productoVM.producto=""
        navController.popBackStack()
    }
    ) {
        TextField(value = productoVM.producto, onValueChange = {productoVM.producto=it})
    }
}