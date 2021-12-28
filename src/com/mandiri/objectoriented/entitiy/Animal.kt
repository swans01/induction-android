package com.mandiri.objectoriented.entitiy

abstract class Animal {
    abstract val name: String
    abstract fun run()
}

class Cat: Animal(){
    override val name: String = "Cat"
    override fun run() {
        println("Cat run")
    }
}