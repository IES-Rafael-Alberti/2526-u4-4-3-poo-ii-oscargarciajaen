package Ejercicio5

import Ejercicio3.Libro

class Juego {
    val tablero: Array<Array<String?>> = Array(3) { arrayOfNulls<String>(3) }

    fun añadirFicha(jugador: Jugador, fila: Int, columna: Int): Boolean {
        var añadida = false
        if (tablero[fila - 1][columna - 1] == null) {
            tablero[fila - 1][columna - 1] = jugador.ficha.toString()
            añadida = true
        }
        return añadida
    }

    fun comprobarEstado():Boolean{
        var terminado: Boolean = false

        // fila 1
        if (tablero[0][0] != null && tablero[0][1] != null && tablero[0][2] != null){
            if (tablero[0][0] == tablero[0][1]  && tablero[0][1] == tablero[0][2]){
                terminado = true
            }
        }

        // fila 2
        if (tablero[1][0] != null && tablero[1][1] != null && tablero[1][2] != null){
            if (tablero[1][0] == tablero[1][1]  && tablero[1][1] == tablero[1][2]){
                terminado = true
            }
        }

        // fila 3
        if (tablero[2][0] != null && tablero[2][1] != null && tablero[2][2] != null){
            if (tablero[2][0] == tablero[2][1]  && tablero[2][1] == tablero[2][2]){
                terminado = true
            }
        }

        // columna 1
        if (tablero[0][0] != null && tablero[1][0] != null && tablero[2][0] != null){
            if (tablero[0][0] == tablero[1][0]  && tablero[1][0] == tablero[2][0]){
                terminado = true
            }
        }

        // columna 2
        if (tablero[0][1] != null && tablero[1][1] != null && tablero[2][1] != null){
            if (tablero[0][1] == tablero[1][1]  && tablero[1][1] == tablero[2][1]){
                terminado = true
            }
        }

        // columna 3
        if (tablero[0][2] != null && tablero[1][2] != null && tablero[2][2] != null){
            if (tablero[0][2] == tablero[1][2]  && tablero[1][2] == tablero[2][2]){
                terminado = true
            }
        }

        // diagonal 1
        if (tablero[0][0] != null && tablero[1][1] != null && tablero[2][2] != null){
            if (tablero[0][0] == tablero[1][1]  && tablero[1][1] == tablero[2][2]){
                terminado = true
            }
        }

        // diagonal 2
        if (tablero[0][2] != null && tablero[1][1] != null && tablero[2][0] != null){
            if (tablero[0][2] == tablero[1][1]  && tablero[1][1] == tablero[2][0]){
                terminado = true
            }
        }
        return terminado
    }

    fun comprobarEmpate(): Boolean{
        var empate: Boolean = true
        for (fila in tablero){
            for (columna in fila){
                if (columna == null){
                    empate = false
                }
            }
        }
        return empate
    }

    override fun toString(): String {
        return " ${tablero[0].contentToString()} \n ${tablero[1].contentToString()} \n ${tablero[2].contentToString()}"
    }
}