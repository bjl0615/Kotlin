package com.example.kotlibasics

fun main() {
    var x = 1
    while(x <= 10) {
        print("$x")
        x++
    }

    println("\nwhile loop is done")

    var y = 100
    while(y >= 0) {
        y -= 2
        println("$y")
    }
}