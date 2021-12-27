package com.mandiri.objectoriented.entitiy

open class Employee(val name: String) {
    open fun sayHello(name: String){
        println("Hello $name, my name is ${this.name}")
    }
}

//function overriding
class Manager(name: String): Employee(name){
    override fun sayHello(name: String){
        println("Hello $name, my name is manager ${this.name}")
    }
}
class VicePresident(name: String): Employee(name)