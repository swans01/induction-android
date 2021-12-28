package com.mandiri.exercise
import com.mandiri.exercise.entity.Customer
import com.mandiri.exercise.entity.Order
import java.util.*

fun main() {
    val customer = Customer("Swandy", "Jakarta")
    customer.sendOrder("Special")
    customer.receiveOrder("Special")

    println("===========================")
    customer.sendOrder("Normal")
    customer.receiveOrder("Normal")
}