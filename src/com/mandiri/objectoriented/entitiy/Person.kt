package com.mandiri.objectoriented.entitiy

class Person {
    var firstName: String = ""
    var lastName: String = ""

    //make method in class
    fun getFullName(): String{
        return "$firstName $lastName"
    }

    //method overloading
    fun sayHello(name: String){
        println("Hello $name, my name is $firstName")
    }

    fun sayHello(paramFirstName: String, paramLastName: String){
        println("Hello $paramFirstName $paramLastName, my name is $firstName")
    }
}
