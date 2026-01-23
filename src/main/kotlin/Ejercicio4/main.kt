package Ejercicio4

import kotlin.random.Random
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(){
    val listaTareas: ListaTareas =  ListaTareas()

    var seleccion: String? = null
    do {
        println("Escoge 1 para crear una tarea, 2 para eliminarla, 3 para cambiar el estado o x para terminar")
        val entrada: String? = readLine()
        if (entrada != null && entrada.all { it.isDigit() } || entrada == "x") {
            if (entrada == "1") {
                val id: Int = (1..1000).random()
                val tarea: Tarea = Tarea(id, "Tarea", "Pendiente")
                listaTareas.agregarTarea(tarea)
                println("Tarea creada $tarea")
            } else if (entrada == "2") {
                var idParaEliminar: Int? = null
                do {
                    println("Introduce el ID de la tarea que desees eliminar")
                    val entradaId: String? = readLine()
                    if (entradaId != null && entradaId.all { it.isDigit() }) {
                        idParaEliminar = entradaId.toInt()
                        listaTareas.eliminarTarea(idParaEliminar)
                    } else {
                        println("Id introducido no válido")
                    }
                } while (idParaEliminar == null)
            } else if (entrada == "3") {
                var tareaIntroducida: Int? = null
                do {
                    println("Introduce el ID de la tarea que desees finalizar")
                    val tareaInput: String? = readLine()
                    if (tareaInput != null && tareaInput.all { it.isDigit() }) {
                        tareaIntroducida = tareaInput.toInt()
                        val tareaFinalizada = listaTareas.listaTareas.filter { it -> it.id == tareaIntroducida }
                        tareaFinalizada.forEach { it.cambiarEstado() }
                        val fechaYHora: LocalDateTime = LocalDateTime.now()
                        val formateador: DateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")
                        val fechaFormateada = fechaYHora.format(formateador)
                        println(listaTareas.listaTareas)
                        println("Tarea terminada ${fechaFormateada}")
                    } else {
                        println("Id inválido")
                    }
                } while (tareaIntroducida == null)
            } else if (entrada == "x") {
                seleccion = "x"
            }
        }
    } while (seleccion == null)
}