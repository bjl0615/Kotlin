package com.example.kotlibasics

fun main() {
//    var x = 15
//    do {
//        print("$x")
//        x++
//    }while (x <= 10)
//        print("\ndo while loop is done")

    var feltTemp = "cold"
    var roomTemp = 10
    while(feltTemp == "cold") {
        roomTemp++
        if(roomTemp >= 20) {
            feltTemp = "comfy"
            println("it's comfy now")
        }
    }
}