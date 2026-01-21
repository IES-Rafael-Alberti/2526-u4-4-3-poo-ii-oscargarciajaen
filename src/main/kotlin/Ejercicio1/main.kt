package Ejercicio1

fun main(){
    val calleFlores = Domicilio("Calle Las Flores", 355)
    val mirasol = Domicilio("Mirasol", 218)
    val laMancha = Domicilio("La Mancha", 761)

    val nuria = Cliente("Nuria", calleFlores)
    val julian = Cliente("Julian", laMancha)
    val jorge = Cliente("Jorge", mirasol)

    val compra1 = Compra(nuria, "02/01/2026", 12780.78)
    val compra2 = Compra(jorge, "15/12/2026",699.0)
    val compra3 = Compra(nuria, "026/01/2026", 532.90)
    val compra4 = Compra(julian, "12/11/2025", 5715.99)
    val compra5 = Compra(jorge, "02/10/2025", 958.0)

    val repositorio1 = RepositorioCompras()
    repositorio1.agregarCompra(compra1)
    repositorio1.agregarCompra(compra2)
    repositorio1.agregarCompra(compra3)
    repositorio1.agregarCompra(compra4)
    repositorio1.agregarCompra(compra5)

    repositorio1.domicilios(calleFlores)
    repositorio1.domicilios(mirasol)
    repositorio1.domicilios(laMancha)

    println(repositorio1.conjuntoDomicilios)
}