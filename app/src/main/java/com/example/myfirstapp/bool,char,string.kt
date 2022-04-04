package com.example.kotlibasics

fun main() {
    //Booleamse he type Boolean is used to represent logical values
    // It can have two possible values true and false
    var isSunny : Boolean = true
    isSunny = false

    //Characters
    val letterChar = 'A'
    val digitChar = '1'

    //Strings
    val myStr = "Hello world"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]

    print("Last " + firstCharInStr)
}