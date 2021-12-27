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

    //make object from class car with constructor
    val car = Car("Camry", "Toyota", "White")
    val aCar = Car("Civic", "Toyota")

    //make object from class user with attributes in constructor
    val user = User("user1", "user@email.com")
    println(user.email)

    //this keyword
    user.sayHello("User2")

    println("============================")

    //INHERITANCE
    val manager = Manager("Nick")
    manager.sayHello("tony")
    val employee = Employee("employee")

    //properties overriding
    val rectangle = Rectangle()
    println(rectangle.corner)
    val triangle = Triangle()
    println(triangle.corner)
    println(triangle.parentCorner)

}