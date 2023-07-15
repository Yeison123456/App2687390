package com.Yeison123456.app2687390

class Condicionales {
}

fun main() {
    print("Digite un numero ")
    var num11= readLine()!!.toInt()

    print("Digite otro numero")
    var num1= readLine()!!.toInt()

    if(num11>num1){

        print("el numero mayor es $num11")

    } else if( num11==num1){

        print("son iguales")

    } else {

        print("el numero mayor es $num1")

    }

    print("ingrese el numero de 1 al 20")
    var num10= readLine()!!.toInt()

    if (num10 in 1..20){
        print("El numero esta en el rango")
    } else {
        print("te dije un numero del 1 al 20")
    }




    var aleatorio=(0..50).random()

    when (aleatorio){
        0 -> print("no hay considencias")
        in 1..10 -> print("hay $aleatorio considencias")
        in 20..50 -> print("hay muchas considencias")
    }


    var dado1=(1..6).random()
    var dado2=(1..6).random()
    var suma7: Int=dado1+dado2
    if(dado1==1 && dado2==1){

        print("Ganaste con un par de $dado1")
    }
    else if(dado1==1 && dado2==2 || dado1==2 && dado2==1){

        print("Ganaste con una suma de 3 en los dados")
    }
    else if(dado1==6 && dado2==5 || dado1==5 && dado2==6){

        print("Ganaste con una suma de 11 en los dados")
    }
    else if(dado1==1 && dado2==1 ||dado1==6 && dado2==6){

        print("Ganaste con una suma de 2 o 12 en los dados")
    }
    else if(suma7==7){

        print("Ganaste con una suma de 7 en los dados")
    }

    print("ingrese el valor de la compra")
    var num= readLine()!!.toInt()


    if(num>50000){
        print("ganaste un descuento por tu compra")
        var bolita=(1..4).random()
        if(bolita==1){
            var pagarR=num*10/100
            var descR=num-pagarR
            print("Sacaste la bolita roja que tiene un descuento del 10% ($descR) el total a pagar es de $pagarR")
        } else if(bolita==2){
            var pagarA=num*30/100
            var descA=num-pagarA
            print("Sacaste la bolita azul que tiene un descuento del 30% ($descA) el total a pagar es de $pagarA")
        } else if(bolita==3){
            var pagarAm=num*50/100
            var descAm=num-pagarAm
            print("Sacaste la bolita amarilla que tiene un descuento del 50% ($descAm) el total a pagar es de $pagarAm")
        } else {
            print("Sacaste la bolita blanca que tiene un descuento del 100% no tienes que pagar nada")
        }

    } else {
        print("no alcanzaste el valor de compra requerido para participar en el descuento")
    }


}