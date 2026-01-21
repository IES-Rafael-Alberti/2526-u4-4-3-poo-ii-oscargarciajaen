package Ejercicio3

class Libro(val titulo: String, val autor: String, val numeroPaginas: Int, val calificacion: Int) {

    init {
        require(this.calificacion in 0..10){"Calificaccion Inválida"}
    }

    override fun toString(): String {
        return "$titulo - $autor - $numeroPaginas - $calificacion"
    }
}