package cl.eftec.app20240508

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class ProductoVM {
    var producto by mutableStateOf("")
    var productos = mutableStateListOf<String>()
    fun agregar() {
        productos.add(producto)
    }

}