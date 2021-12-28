package com.mandiri.exercise.entity

import java.util.*

class Customer(var name: String, var location: String) {
    var counterNormal = 0
    var counterSpecial = 0
    val specialOrder = SpecialOrder()
    val normalOrder = NormalOrder()
    fun sendOrder(orderType: String){
        if (orderType == "Special"){
            counterSpecial++
            specialOrder.date = Date()
            specialOrder.number = "Order Special number $counterSpecial"
            specialOrder.confirm()
            specialOrder.dispatch()
        }else if (orderType == "Normal"){
            counterNormal++
            specialOrder.date = Date()
            normalOrder.number = "Order Normal number $counterNormal"
            normalOrder.receive()
            normalOrder.confirm()
            normalOrder.dispatch()
        }
    }

    fun receiveOrder(orderType: String){
        if (orderType == "Special"){
            specialOrder.close()
        }else if(orderType == "Normal"){
            normalOrder.close()
        }
    }
}