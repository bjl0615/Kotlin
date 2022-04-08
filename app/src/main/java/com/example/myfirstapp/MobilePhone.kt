package com.example.kotlibasics

fun main() {
    var iphone = MobilePhone("ios" , "apple" , "Iphone pro");
    var samsung = MobilePhone("ios" , "samsung" , "s22");
    var phone = MobilePhone("Android" , "samsung" , "s21");
}

class MobilePhone(osName : String , brand : String , model : String) {
    init {
        println("$osName $brand $model");
    }
}