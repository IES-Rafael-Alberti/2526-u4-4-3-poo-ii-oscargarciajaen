package Ejercicio4

import jdk.nashorn.internal.runtime.Debug.id

class ListaTareas {
    val listaTareas: MutableList<Tarea> = mutableListOf()

    fun agregarTarea(tarea: Tarea) {
        listaTareas.add(tarea)
    }

    fun eliminarTarea(id: Int){
        listaTareas.removeAll { it.id == id}
    }

    override fun toString(): String {
        return "$listaTareas"
    }
}