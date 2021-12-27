package com.mandiri.objectoriented

import com.mandiri.objectoriented.entitiy.*

fun main() {
    fun main() {
        //make object from class person
        val tony = Person()
        val steve = Person()

        tony.firstName = "Tony"
        println(tony.firstName)

        steve.lastName = "Rogers"
        println(steve.lastName)

        //make object from class car with constructor
        val car = Car("Civiv", "Toyota")

    }
}