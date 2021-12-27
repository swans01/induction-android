package com.mandiri.objectoriented.`object`

import com.mandiri.objectoriented.entitiy.Car
import com.mandiri.objectoriented.entitiy.User

fun main() {
    //make object from class car with constructor
    val car = Car("Camry", "Toyota", "White")
    val aCar = Car("Civic", "Toyota")

    //make object from class user with attributes in constructor
    val user = User("user1", "user@email.com")
    println(user.email)
}