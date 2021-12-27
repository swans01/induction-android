package com.mandiri.objectoriented.`object`

import com.mandiri.objectoriented.entitiy.Laptop

fun main() {
    printObject("Swandy")
    printObject(Laptop("Lenovo"))
}

fun printObject(any: Any){
    if (any is Laptop){
        println("Laptop ${any.name}")
    }else{
        println(any)
    }

}

fun printObjectWhen(any: Any){
    when (any) {
        is Laptop -> println("Laptop ${any.name}")
        else -> println(any)
    }

}