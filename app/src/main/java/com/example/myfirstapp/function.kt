package com.example.kotlibasics

fun main() {
    var result = average(60.5, 30.5)
    print("result is $result")
}

fun average(a: Double, b: Double) : Double {
    var c : Double = a + b
    return c / 2
}

// Parameter (input)
fun addUp(a: Int, b: Int) : Int{
    // output
    return a+b
}

fun myFunction() {
    print("Called from myFunction")
}