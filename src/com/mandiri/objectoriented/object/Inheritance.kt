package com.mandiri.objectoriented.`object`

import com.mandiri.objectoriented.entitiy.Employee
import com.mandiri.objectoriented.entitiy.Manager

fun main() {
    //INHERITANCE
    val manager = Manager("Nick")
    manager.sayHello("tony")
    val employee = Employee("employee")
}