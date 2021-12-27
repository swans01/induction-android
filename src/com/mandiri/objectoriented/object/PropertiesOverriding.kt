package com.mandiri.objectoriented.`object`

import com.mandiri.objectoriented.entitiy.Rectangle
import com.mandiri.objectoriented.entitiy.Triangle

fun main() {
    //properties overriding
    val rectangle = Rectangle()
    println(rectangle.corner)
    val triangle = Triangle()
    println(triangle.corner)
}