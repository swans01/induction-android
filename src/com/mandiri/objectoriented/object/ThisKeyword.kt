package com.mandiri.objectoriented.`object`

import com.mandiri.objectoriented.entitiy.User

fun main() {
    val user = User("user1", "user@email.com")

    //this keyword
    user.sayHello("User2")
}