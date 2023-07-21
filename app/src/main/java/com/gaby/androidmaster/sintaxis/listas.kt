package com.gaby.androidmaster.sintaxis

fun main(){

    amigosInnutables()
    amigosMutablers()

}

//LISTAS INMUTABLES

    fun amigosInnutables(){
        //Armando una lista de amigos
        val amigos:List<String> = listOf("Gaby","Raquel","Fani","Yora")
        println(amigos)


        //Recorriendo la lista con un bucle for
        for(amigo in amigos){
            println(amigo)
        }

        //Sacando el indice 0 de la lista
        println(amigos[0])

        //Sacando la ultima posicion de la lista
        println(amigos.last())

        //Sacando la primera posicion de la lista
        println(amigos.first())

        //Filtrando por los componentes que contengan 'a'
        println(amigos.filter { it.contains("a") })

        //Filtrando por los componentes que contengan 'y'
        println(amigos.filter { it.contains("y") })

        //Recorriendo la lista con un bucle forEach
        amigos.forEach{amigos -> println(amigos) }
        println()
        println()

    }

//LISTAS MUTABLES



    fun amigosMutablers(){

        //Creando lista de amigos mutables
        val amigosMutable:MutableList<String> = mutableListOf("Gaby","Fani","Raquel","Gerard")
        println(amigosMutable)

        //Agregamos nuevos elementos a la lista
        amigosMutable.add("Yuri")
        amigosMutable.add("Judi")

        //Agregamos nuevo elemento en PRIMERA posicion.
        amigosMutable.add(0,"primerElemento")
        println(amigosMutable)


        if (amigosMutable.isEmpty()){
            println("La lista esta vacia, no se puede pintar nada")
        }
        else{
            println(amigosMutable)
        }

        //Devuelve el ultimo elemento
        amigosMutable.last()

        //SIEMPRE intentaremos usar el bucle forEaech
        amigosMutable.forEach { amigosMutable -> println(amigosMutable) }
    }




