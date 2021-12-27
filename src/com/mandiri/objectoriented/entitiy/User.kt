package com.mandiri.objectoriented.entitiy

class User(var userName: String, var email: String) {

    fun sayHello(userName: String){
        //using this keyword to referring userName in class attribute
        println("Hello $userName, my name is ${this.userName}")
    }
}