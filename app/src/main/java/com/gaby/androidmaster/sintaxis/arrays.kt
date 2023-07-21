package com.gaby.androidmaster.sintaxis

fun main(){

    var name:String = "Gabriel"
    var name1:String = "Raquel"
    var name2:String = "Fani"
    var name3:String = "Gerard"

    val daysOfWeek = arrayOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")


//    for (dia in daysOfWeek){
//        println(dia)
//    }

    println()
    println()
    println("Vamos a probar de recorrer un array con forEach")

    daysOfWeek.forEach { daysOfWeek -> println(daysOfWeek) }

}