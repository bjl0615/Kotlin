package com.example.kotlibasics

fun main() {
    for(num in 1..10) {
        print("$num")
    }

    for(i in 1 until 10) {
        print("$i ")
    }
    println("---------------------")
    for(i in 10 downTo 1 step 2) { //Same as - for(i in 10.dpwnTo(1))
        print("$i")
    }

    // Test
    // 1.
    for(i in 0 until 10000) {
        if(i == 9001) {
            println("IT'S OVER 9000")
        }
    }

    // 2.
    var humidity = "humid"
    var humidityLevel = 80
    while ( humidity == "humid") {
        humidityLevel -= 5
        println("humidity descreased")
        if(humidityLevel < 60) {
            humidity = "comfy"
            println("it's comfy now")
        }
    }

}