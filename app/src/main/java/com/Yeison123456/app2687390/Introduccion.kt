package com.Yeison123456.app2687390

class Introduccion {
}

fun main() {
    var largo: Long=-1234567890034343442
    var medioLargo: Int=-1234567890
    var medio: Short=-2345
    var pequeño: Byte=-12


    var decimalLargo: Double=3.14159269793
    var decimalMediano: Float=3.14159F
    var corto: Char= 'f'
    var verdaderoFalso: Boolean= true


    print("Digite su nombre ")
    var nombre= readLine()

    print("Digite su apellido ")
    var apellido= readLine()

    print("Digite su edad ")
    var edad= readLine()!!.toInt()


    print("En 10 años ${nombre} ${apellido} tendra ${edad+10} años")

}