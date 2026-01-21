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

        fun transferencia(cuentaA: Cuenta, cuentaB: Cuenta): Boolean{
            var transferenciaHecha = false
            if (cuentaB.saldo > 0){
                cuentaA.saldo += cuentaB.saldo
                cuentaB.saldo = 0
                transferenciaHecha = true
            }
            return transferenciaHecha
        }
    }

    override fun toString(): String {
        return "[$numeroCuenta | $saldo€]"
    }
}