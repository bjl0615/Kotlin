package com.example.kotlibasics

fun main() {
    var lee = Person("Lee" , "bongjun")
    var john = Person()
    var johnPerterson = Person(lastName = "Peterson")
}

class Person(firstName : String = "John", lastName: String = "Doe") {

    init {
        println("Initialized a new Person object with" +
                "firstName = $firstName and lastName = $lastName")
    }
}