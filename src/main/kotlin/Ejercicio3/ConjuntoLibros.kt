package Ejercicio3

class ConjuntoLibros {
    var conjuntoDeLibros: Array<Libro?> = arrayOfNulls<Libro>(2)

    fun agregarLibro(libro: Libro) {
        require(conjuntoDeLibros.any {it == null}) {"Conjunto de libros lleno"}
        var libroAñadir : Libro? = libro
        for (i in 0..(conjuntoDeLibros.size - 1)) {
            if (conjuntoDeLibros[i] == null && libroAñadir != null){
                conjuntoDeLibros[i] = libroAñadir
                libroAñadir = null
            }
        }
    }

    fun eliminarLibroPorAutor(autor: String) {
        for (i in 0..(conjuntoDeLibros.size - 1)) {
            if (conjuntoDeLibros[i]?.autor == autor) {
                conjuntoDeLibros[i] = null
            }
        }
    }

    fun eliminarLibroPorTitulo(titulo: String) {
        for (i in 0..(conjuntoDeLibros.size - 1)) {
            if (conjuntoDeLibros[i]?.titulo == titulo) {
                conjuntoDeLibros[i] = null
            }
        }
    }

    fun mejorPuntuado(): Libro? {
        var mejorPuntuado: Libro? = conjuntoDeLibros.filterNotNull().maxByOrNull {it.calificacion }
        return mejorPuntuado
    }

    fun peorPuntuado(): Libro? {
        var peorPuntuado: Libro? = conjuntoDeLibros.filterNotNull().minByOrNull { it.calificacion }
        return peorPuntuado
    }

    override fun toString(): String {
        return "${conjuntoDeLibros[0]} ${conjuntoDeLibros[1]}"
    }
}