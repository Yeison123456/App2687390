package com.Yeison123456.app2687390

class Nequi {
}

fun sacar(tipo: String?, saldo: Long): Long{
    var saldito: Long= saldo!!
    if (tipo == "inicio") {
        println("El saldo disponible es: $saldito")
    } else if (tipo == "sacar") {
        if (saldo < 2000) {
            println("No te alcanza")
        } else {
            println("Cuanto dinero quiere sacar?")
            var valor = readLine()!!.toInt()
            if (valor<saldito) {
                var num1 = (100000..999999).random()
                println("tu codigo es " + num1)
                println("ingrese el numero que le enviamos?")
                var num2 = readLine()!!.toInt()
                if(num1==num2){
                    saldito=saldito-valor
                    println("se retiro correctamente el dinero, te quedan $saldito")
                }
            }
        }
    }
    return saldito
}
fun retirar(tipo: String?, saldo: Long?): Long{
    var saldito: Long=saldo!!
    if (tipo=="accion"){
        println("Cual es el numero al que desea enviar el dinero?")
        var num = readLine()!!.toInt()
        println("Cual valor total a enviar?")
        var valor = readLine()!!.toLong()
        if (valor>saldito){
            println("No es posible enviar el dinero, porque no tienes el dinero suficiente($saldito)")
        } else {
            saldito=saldito-valor
            println("El dinero se envio correctamente, ahora tienes $saldito")
        }
    }
    return saldito
}

fun recargar(tipo: String?, saldo: Long?): Long{
    var saldito: Long=saldo!!
    if (tipo=="accion"){
        println("Cuanto es el dinero a recargar?")
        var rec = readLine()!!.toInt()
        println("Segura que quiere recargar $rec? 1. Si 2. No")
        var dec = readLine()!!.toInt()
        if (dec==1){
            saldito=saldito+rec
            println("Se Recargo correctamente, ahora tienes $saldito")
        } else {
            println("No se recargara pues")
        }
    }
    return saldito
}

fun pedir(tipo: String?,saldo: Long?): Long{
    var saldito: Long=saldo!!
    if (tipo=="accion") {
        println("Numero al que le vas a pedir dinero?")
        var num = readLine()!!.toInt()
        println("Cuanto dinero le vas a pedir")
        var dine = readLine()!!.toInt()
        saldito = saldo + dine
        println("El prestamos fue exitoso ahora tienes $saldito")
    }
    return saldito
}
fun recargarCel(saldo: Long?): Long{
    var saldito: Long=saldo!!
    println("Escoje el operador: 1.Claro  2.Tigo 3. WOM ")
    var ope = readLine()!!.toInt()
    if(ope==1 || ope==2 ||ope==3) {
        println("Digite el numero de celular")
        var num = readLine()!!.toInt()
        println("Cuanto vas a recargar?")
        var valor = readLine()!!.toInt()
        if(valor>saldito){
            println("solo puedes recargar menor o igual a $valor")
        } else{
            saldito=saldito-valor
            println("Se recargo correctamente, te quedan $saldito")
        }
    } else{
        println("El operador que escogiste no existe")
    }
    return saldo
}


fun main() {
    var bien: Int=3
    var saldo: Long= 4500
    do{
        println("Digite el numero de celular")
        var cel = readLine()!!.toLong()
        println("Digite la contraseña")
        var con = readLine()!!.toString()


        if(bien>=1 && bien<=3){
            if (cel==3212518776 && con=="12345Da") {
                sacar(tipo = "inicio", saldo)
                do {
                    println("Estas son las funcionalidades de nequi: 1. sacar 2. enviar 3. Recargar 4. Pedir  5. Recargar 6. Salir")
                    var dec = readLine()!!.toInt()

                    when (dec) {
                        1-> do{
                            println("Escoje alguna de estas dos opciones: 1. Cajero 2. Punto Fisico ")
                            var dec = readLine()!!.toInt()
                            if (dec==1 || dec==2){
                                saldo=sacar(tipo="sacar",saldo)
                            }
                            var siga: Int=2
                        } while (siga==1)
                        2-> do{
                            saldo=retirar(tipo="accion",saldo)
                            var siga=2
                        } while (siga==1)
                        3-> do{
                            saldo=recargar(tipo="accion",saldo)
                            var siga=2
                        } while (siga==1)
                        4-> do{
                            saldo=pedir(tipo = "accion",saldo)
                            var siga=2
                        } while (siga==1)
                        5-> do{
                            saldo=recargarCel(saldo)
                            var siga=2
                        } while (siga==1)
                        6-> break
                    }
                    println("Quieres hacer otra accion? 1.Si 2.No")
                    var siga1= readLine()!!.toInt()

                } while (siga1==1)
            } else{
                bien=bien-1
                println(" ¡Upps! Parece que tus datos de acceso no son correctos, Tienes $bien  intentos más \n")
            }
        }
    } while (bien>0)

}

