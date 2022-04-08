package com.example.kotlibasics

var b = 3
fun main() {
    myFunction(5)
    b = 3
}

// this a is a parameter
fun myFunction(a:Int) {
    // a is a variable
    b = a
    println("a is $b")
}