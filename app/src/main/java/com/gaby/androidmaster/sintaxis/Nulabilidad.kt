package com.gaby.androidmaster.sintaxis

import android.annotation.SuppressLint

@SuppressLint("SuspiciousIndentation")
fun main(){
    var name:String? =  null

        print(name?.get(3) ?: "Es nulo wey, esto no vale")
    }
