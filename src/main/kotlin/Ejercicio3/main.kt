package Ejercicio3

fun main(){
    try {
        val libro1 = Libro("Jujutsu Kaisen 0", "Jeje akutami", 40, 9)
        val libro2 = Libro("It", "Stephen King", 1427, 10)
        val conjuntoDeLibros = ConjuntoLibros()

        conjuntoDeLibros.agregarLibro(libro1)
        conjuntoDeLibros.agregarLibro(libro2)

        conjuntoDeLibros.eliminarLibroPorAutor("Stephen King")

        conjuntoDeLibros.eliminarLibroPorTitulo("Jujutsu Kaisen 0")
        conjuntoDeLibros.agregarLibro(libro1)

        println(conjuntoDeLibros)
    } catch (e: Exception) {
        println(e.message)
    }
}
