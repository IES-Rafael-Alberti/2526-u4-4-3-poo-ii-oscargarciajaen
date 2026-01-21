package Ejercicio2

fun main(){
    val josemi = Persona("32910568A")
    val cuenta1 = Cuenta(123456, 0)
    val cuenta2 = Cuenta(234567, 700)

    josemi.añadirCuenta(cuenta1)
    josemi.añadirCuenta(cuenta2)

    cuenta1.recibirAbono(1100)
    cuenta1.realizarPago(750)

    val moroso: Boolean = Cuenta.esMorosa(josemi)
    if (moroso){
        println("Es un moroso")
    } else {
        println("No tiene deudas")
    }

    Cuenta.transferencia( cuenta2, cuenta1)

    println(josemi)
}