package Ejercicio5

fun main(){
    var estado: Boolean = false
    val jugador1 = Jugador("Maguitopop", 'o')
    val jugador2 = Jugador("MxO", 'm')
    val juego = Juego()
    var añadida = false
    println(juego)
    while (estado == false) {
        while (añadida == false) {
            val filaJugador1 = jugador1.elegirFila()
            val columnaJugador1 = jugador2.elegirColumna()
            añadida = juego.añadirFicha(jugador1, filaJugador1, columnaJugador1)
            if (añadida == false) {
                println("Error casilla inválida")
                println(juego)
            }
        }
        añadida = false
        estado = juego.comprobarEstado()
        println(juego)
        if (estado == true){
            println("Ha gando $jugador1")
        }
        estado = juego.comprobarEmpate()
        if (estado == true){
            println("Empate")
        }
        if (estado == false) {
            while (añadida == false) {
                val filaJugador2 = jugador1.elegirFila()
                val columnaJugador2 = jugador2.elegirColumna()
                añadida = juego.añadirFicha(jugador2, filaJugador2, columnaJugador2)
                if (añadida == false) {
                    println("Error casilla inválida")
                    println(juego)
                }
            }
            añadida = false
            estado = juego.comprobarEstado()
            println(juego)
            if (estado == true){
                println("Ha gando $jugador2")
            }
            estado = juego.comprobarEmpate()
            if (estado == true){
                println("Empate")
            }
        }
    }
}