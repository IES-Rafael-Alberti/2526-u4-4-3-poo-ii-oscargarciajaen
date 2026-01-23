package Ejercicio5

class Jugador(val nickname: String, val ficha: Char) {

    fun elegirFila(): Int{
        var fila: Int? = null
        do {
            println("Introduce el numero de la fila 1 - 3 ")
            val filaIntroducida: String? = readLine()
            if (filaIntroducida != null && filaIntroducida.all { it.isDigit() }) {
                val filaIntroducidaInt = filaIntroducida.toInt()
                if (filaIntroducidaInt in 1..3) {
                    fila = filaIntroducidaInt
                } else{
                    println("Entrada inválida")
                }
            }else {
                println("Entrada inválida")
            }
        } while (fila == null)
        return fila
    }

    fun elegirColumna(): Int{
        var columna: Int? = null
        do {
            println("Introduce el numero de la columna 1 - 3 ")
            val columnaIntroducida: String? = readLine()
            if (columnaIntroducida != null && columnaIntroducida.all { it.isDigit() }) {
                val columnaIntroducidaInt = columnaIntroducida.toInt()
                if (columnaIntroducidaInt in 1..3) {
                    columna = columnaIntroducidaInt
                } else{
                    println("Entrada inválida")
                }
            }else {
                println("Entrada inválida")
            }
        } while (columna == null)
        return columna
    }

    override fun toString(): String {
        return "$nickname"
    }

}