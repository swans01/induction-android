package com.mandiri.exercise.entity

import java.util.*

open class Order(var date: Date, var number: String) {
    open fun confirm(){
        println("$number is confirmed at $date")
    }

    open fun close(){
        println("$number is received by customer at $date")
    }
}

class SpecialOrder(date: Date = Date(), number: String = ""): Order(date, number){
    fun dispatch(){
        println("$number is dispatched and on the way to customer")
    }
}

class NormalOrder(date: Date = Date(), number: String = ""): Order(date, number){
    fun dispatch(){
        println("$number is dispatched and on the way to customer")
    }

    fun receive(){
        println("$number is received by restaurant")
    }
}