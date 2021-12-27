package com.mandiri.objectoriented.`object`

import com.mandiri.objectoriented.entitiy.Person

fun main() {
    val person = Person()
    val person2 = Person()

    person.firstName = "Andy"
    person2.firstName = "Andy"

    println(person==person2)
}