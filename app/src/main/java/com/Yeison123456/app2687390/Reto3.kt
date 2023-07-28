package com.Yeison123456.app2687390

class Reto3 {
}

fun main() {
    var listaAutos= mutableListOf("Chevreolet")


    do {


        print("Que accion quieres hacer? 1. Registrar auto  2.Mostrar listado de autos 3.Buscar auto  4. Modificar auto  5. Eliminar auto  6.Borrar lista")
        var dec= readLine()!!.toInt()

        when(dec){
            1 ->    do{
                println("Digite el nuevo auto")
                var nomAu= readLine()!!.toString()
                if(listaAutos.contains(nomAu)==true){
                    println("Este auto ya existe")
                } else {
                    listaAutos.add(nomAu)
                    println("Se registro corectamente")
                }
                println("Quieres registrar otro auto? 1.Si 2.No")
                var siga= readLine()!!.toInt()
            } while(siga==1)

            2 -> 	println("Estos son los autos que tiene la lista $listaAutos")

            3 ->   	do{
                println("Digite el nombre del auto a buscar")
                var nomAuto= readLine()!!.toString()
                if(listaAutos.contains(nomAuto)==true){
                    println("Este auto llamado: $nomAuto si existe")
                } else {
                    println("Este auto no existe en la lista")
                }
                println("Quieres buscar otro auto? 1.Si 2.No")
                var siga2= readLine()!!.toInt()
            } while(siga2==1)

            4 ->    do{
                        for  ((posicion, element) in listaAutos.withIndex()){
                            println("En la posicion $posicion esta el auto $element")
                        }
                        println("Cual es la posicion del auto que quiere modificar?")
                        var posi= readLine()!!.toInt()
                        println("Cual es el nuevo nombre del auto que quiere modificar?")
                        var modiNom= readLine()!!.toString()
                        listaAutos[posi]=modiNom
                        if(listaAutos.contains(modiNom)==true){
                            println("Se modifico correctamente")
                        } else {
                            println("Hubo un error al momento de modifiar el auto")
                        }
                        println("Quieres modificar otro auto? 1.Si 2.No")
                        var siga3= readLine()!!.toInt()
                } while(siga3==1)

            5->	do{
                    println("Cual es el nombre del auto que quiere eliminar?")
                    var removeNom= readLine()

                    if(listaAutos.remove(removeNom)==false){
                        println("El auto a eliminar no existe")
                    }
                    else {
                        listaAutos.remove(removeNom)
                        println("Se Elimino correctamente")
                    }
                    println("Quieres eliminar otro auto? 1.Si 2.No")
                    var siga4= readLine()!!.toInt()
                } while(siga4==1)

                6 ->listaAutos.clear()
        }


    println("Quieres hacer otra accion? 1.Si 2.No")
    var siga5= readLine()!!.toInt()

} while(siga5==1)


}