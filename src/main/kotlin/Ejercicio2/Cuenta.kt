package Ejercicio2

class Cuenta(val numeroCuenta: Int, saldoDisponible: Int) {
    var saldo = saldoDisponible
    private set

    fun consultarSaldo(): Int{
        return this.saldo
    }

    fun recibirAbono(abono: Int){
        require(abono > 0) {"Abono inválido"}
        this.saldo += abono
    }

    fun realizarPago(pago:Int){
        this.saldo -= pago
    }

    companion object{

        fun esMorosa(persona: Persona): Boolean{
            var morosa = false
            for (i in persona.cuentasASuNombre){
                if (i != null){
                    if (i.saldo < 0){
                        morosa = true
                    }
                }
            }
            return morosa
        }

        fun transferencia(personaA: Persona, personaB: Persona, idCuentaA: Int, idCuentaB: Int, cantidad: Int): Boolean{
            var transferenciaHecha = false
            var cuentaA: Cuenta? = null
            var cuentaB: Cuenta? = null
            for(i in personaA.cuentasASuNombre){
                if(i != null){
                    if (i.numeroCuenta == idCuentaA){
                        cuentaA = i
                    }
                }
            }

            for(i in personaB.cuentasASuNombre){
                if(i != null){
                    if (i.numeroCuenta == idCuentaB){
                        cuentaB = i
                    }
                }
            }

            if (cuentaA != null && cuentaB != null){
                cuentaA?.saldo += cantidad
                cuentaB?.saldo -= cantidad
                transferenciaHecha = true
            }

            return transferenciaHecha
        }
    }

    override fun toString(): String {
        return "[$numeroCuenta | $saldo€]"
    }
}