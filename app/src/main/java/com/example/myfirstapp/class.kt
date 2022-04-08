package com.example.kotlibasics

fun main() {
    var Lee = Person("Lee", "Bong" , 24);
    Lee.hobby = "skateboard"
    Lee.stateHobby();
    Lee.age = 25
    println(Lee.age)
    var john = Person();
    john.hobby = "play video games"
    john.stateHobby()
//    var bong = Person(lastName = "jun");
}

class Person (firstName : String = "Bong", lastName : String = "jun") {
    // Member Variables - properties
    var age : Int? = null
    var hobby : String = "watch Netflix";
    var firstName : String? = null

    init {
        this.firstName = firstName
        println("firstName = $firstName LastName = $lastName");
    }

    //Member secondary Constructor
    constructor(firstName : String, lastName: String, age: Int)
                : this(firstName,lastName) {
                 this.age = age
            }

    //Member functions - Methods
    fun stateHobby() {
        println("$firstName \'s hobby us $hobby")
    }
}