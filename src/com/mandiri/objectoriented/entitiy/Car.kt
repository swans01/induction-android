package com.mandiri.objectoriented.entitiy

class Car (name: String, brand: String, color: String) {

    init {
        println("Car $name from $brand created")
    }

    constructor(name: String, brand: String):
            this (name, brand, "black"){
                println("Car $name created with color black")
            }

    var name: String = name
    var brand: String = brand
    var color: String = color
}