package Ejercicio1

class RepositorioCompras {

    val listaCompras: MutableList<Compra> = mutableListOf()
    val conjuntoDomicilios: MutableSet<Domicilio> = mutableSetOf()

    fun agregarCompra(compra: Compra) {
        listaCompras.add(compra)
    }

    fun domicilios(domicilio: Domicilio):Set<Domicilio>{
        conjuntoDomicilios.add(domicilio)
        return conjuntoDomicilios
    }
}