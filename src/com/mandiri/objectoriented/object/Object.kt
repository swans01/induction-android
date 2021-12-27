package com.mandiri.objectoriented

import com.mandiri.objectoriented.entitiy.*

fun main() {
    //make object from class person
    val tony = Person()
    val steve = Person()

    tony.firstName = "Tony"
    tony.lastName = "Stark"
    println(tony.firstName)
    //calling object method
    println(tony.getFullName())

    //calling method overloading
    tony.sayHello("Swandy")
    tony.sayHello("Swandy","Pakpahan")

    steve.lastName = "Rogers"
    println(steve.lastName)

}