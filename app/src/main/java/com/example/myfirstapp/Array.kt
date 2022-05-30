package com.example.kotlibasics

fun main() {

//    val numbers:IntArray = intArrayOf(1,2,3,4,5,6)

//    val numbers = intArrayOf(1,2,3,4,5,6)

    val numbers = arrayOf(1,2,3,4,5,6)
    val numbersD:DoubleArray = doubleArrayOf(1.0 , 2.0 , 3.0, 4.0 ,5.0,6.0)
//    print(numbers.contentToString())
//    print(numbers[0])
//    print("inital values ${numbersD.contentToString()}")
    numbersD[0] = 6.0
    numbersD[1] = 5.0
    numbersD[4] = 2.0
    numbersD[5] = 1.0

    val days = arrayOf("Sun", "Mon" , "Tues" , "Wed" , "Thurs" , "Fri" , "Sat")
    print(days.contentToString())

    val fruits = arrayOf(Fruit("Apple" , 2.5), Fruit("Grape" , 3.5))
//    print(fruits.contentToString())
    for(fruit in fruits) {
        print("\n${fruit.name}")
    }

    for(index in fruits.indices) {
        print("\n${fruits[index].name} is in index $index")
    }

    val mix = arrayOf("Sun" , "Mon" , "Tues" , 1, 2, 3, Fruit("Apple" , 2.5))
    print(mix.contentToString())
}

data class Fruit(val name : String , val price : Double)