package Ejercicio4

class Tarea(val id: Int, val descripcion: String, var estado: String = "Pendiente") {

    fun cambiarEstado() {
        this.estado = "Terminado"
    }

    override fun toString(): String {
        return "Tarea(id=$id, estado=$estado)"
    }
}