package com.Yeison123456.app2687390

class Reto2 {
}

fun main() {
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