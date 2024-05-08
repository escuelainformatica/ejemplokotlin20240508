package cl.eftec.app20240508

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import cl.eftec.app20240508.paginas.pagina1
import cl.eftec.app20240508.paginas.pagina2

@Composable
fun Navegacion() {
    val navController = rememberNavController()
    var productoVM=ProductoVM()
    NavHost(navController = navController, startDestination = "screen1") {
        composable("screen1") { pagina1(navController,productoVM) }
        composable(
            route = "screen2/{name}",
            arguments = listOf(navArgument("name") { type = NavType.StringType })
        ) { backStackEntry ->
            pagina2(
                navController,
                productoVM,
                name = backStackEntry.arguments?.getString("name") ?: ""
            )
        }
    }
}