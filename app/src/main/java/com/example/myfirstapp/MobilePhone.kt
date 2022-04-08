package com.example.kotlibasics

fun main() {
//    var iphone = MobilePhone("ios" , "apple" , "Iphone pro");
    var samsung = MobilePhone("ios" , "samsung" , "s22");
//    var phone = MobilePhone("Android" , "samsung" , "s21");

    samsung.chargeBattery(60)
    samsung.useBattery(50)
}

class MobilePhone(osName : String , brand : String , model : String) {
    private var battery : Int = 50

    fun chargeBattery(charge : Int) {
        battery += charge
        println("배터리가 $battery 퍼센트 입니다.")
    }

    fun useBattery(use : Int) {
        battery -= use
        println("배터리가 $battery 퍼샌트 입니다.")
        if(battery == 0 || battery < 0) {
            println("배터리가 없습니다 충전해 주세요")
        }
    }
    init {
        println("$osName $brand $model");
    }
}