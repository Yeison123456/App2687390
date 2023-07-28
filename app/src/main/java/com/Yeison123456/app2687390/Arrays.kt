package com.Yeison123456.app2687390

class Arrays {
}
fun main() {

    val pets = arrayOf("dog", "cat", "canary")   //Crear un arrary
    println(pets.contentToString())  //Para mostrarlo

    println(pets.contentToString())

    print(pets[1])

    pets[2] = "parrot"

    print(pets[2])


    for (element in pets) {
        print("La mascota es: $element")
    }


    for ((posicion, element) in pets.withIndex()) {
        println("La posicion de la mascota $element es $posicion")
    }




}
