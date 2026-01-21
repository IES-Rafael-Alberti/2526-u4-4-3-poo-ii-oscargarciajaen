package Ejercicio2

class Persona(val dni: String) {

    val cuentasASuNombre: Array<Cuenta?> = arrayOfNulls<Cuenta>(3)

    fun añadirCuenta(cuenta: Cuenta){
        require(cuentasASuNombre[0] == null || cuentasASuNombre[1] == null || cuentasASuNombre[2] == null){"Esta persona no puede tener más cuentas a su nombre"}
        if (cuentasASuNombre[0] == null) {
            cuentasASuNombre[0] = cuenta
        } else if(cuentasASuNombre[1] == null) {
            cuentasASuNombre[1] = cuenta
        } else {
            cuentasASuNombre[2] = cuenta
        }
    }

    override fun toString(): String {
        var cuentasCreadas: MutableList<Cuenta> = mutableListOf<Cuenta>()
        for (i in cuentasASuNombre) {
            if (i != null) {
                cuentasCreadas.add(i)
            }
        }
        return "DNI: $dni Cuentas creadas: $cuentasCreadas"
    }
}