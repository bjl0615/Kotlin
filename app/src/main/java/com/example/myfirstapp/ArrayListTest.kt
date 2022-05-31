package com.example.kotlibasics

fun main() {
    val array : ArrayList<Double> = ArrayList()
    array.add(1.0)
    array.add(2.0)
    array.add(3.0)
    array.add(4.0)
    array.add(5.0)
    var sum = 0.0
    for(i in array){
        sum += i
    }
    var avg = sum / array.size
    println(avg)
}