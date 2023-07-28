package com.Yeison123456.app2687390

class Reto1 {
}

fun main() {
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
}