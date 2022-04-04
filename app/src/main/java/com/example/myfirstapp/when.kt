package com.example.kotlibasics

fun main() {
    var season = 3
    when(season){
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    var month = 3
    when(month) {
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        in 12 downTo 2 -> println("Winter")
        else -> println("Invalid Season")
    }

    var age = 24

    when(age) {
        !in 0..20 -> ("now you may drink in the US")
        in 18..20 -> println("you may vote now")
        16,17 -> println("you may drive now")
        else -> println("you're too young")
    }

    var x : Any = "13.37f"
    when(x) {
        is Int -> println("$x is an Int")
        !is Double -> println("$x is not Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }
}