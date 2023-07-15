package com.Yeison123456.app2687390

class Ciclos {
}

fun main() {
    for (i in 1..5) print(i)
    println()
    for (i in 5 downTo 0) print(i)  //desincrementa
    println()
    for (i in 1..10 step 2) print(i) // incrementa de a 2
    println()
    for (i in 10 downTo 1 step 2) print(i)
    println()
    for(i in 'a' .. 'e') print(i)


    /*Saber si es par o no, con un operador modular, es el reciduo de la divicion*/

    var sumarP: Int=0
    var sumaI: Int=0
    var par: Int=0
    var inpar: Int=0
    for (i in 1..10) {

        print("ingrese un numero del 1 al 10")
        var num= readLine()!!.toInt()

        if(num<=0){
            break
        } else if(num%2==0){
            sumarP=sumarP+num
            par= par+1
            print("par")
            break
        } else {
            sumaI=sumaI+num
            inpar= inpar+1
            print("inpar")
        }
    }

    print("$par numeros son pares y la suma de estos es de $sumarP, $inpar numeros son inpares y la suma de estos es de $sumaI")

    var sumarP2: Int=0
    var sumaI2: Int=0
    var par2: Int=0
    var inpar2: Int=0
    var dec: Int=1
    while(dec==1){
        print("ingrese un numero del 1 al 10")
        var num2= readLine()!!.toInt()

        if(num2<=0){
            break
        } else if(num2%2==0){
            sumarP2=sumarP2+num2
            par2= par2+1
            print("par")
            break
        } else {
            sumaI2=sumaI2+num2
            inpar2= inpar2+1
            print("inpar")
        }

        print("quieres volver a intentarlo? 1.Si 2.No")
        dec= readLine()!!.toInt()
    }


    var sumarP3: Int=0
    var sumaI3: Int=0
    var par3: Int=0
    var inpar3: Int=0
    do {
        print("ingrese un numero del 1 al 10")
        var num3= readLine()!!.toInt()

        if(num3<=0){
            break
        } else if(num3%2==0){
            sumarP3=sumarP3+num3
            par3= par3+1
            print("par")
            break
        } else {
            sumaI3=sumaI3+num3
            inpar3= inpar3+1
            print("inpar")
        }

        print("quieres volver a intentarlo? 1.Si 2.No")
        var dec2= readLine()!!.toInt()
    } while (dec2==1)

}