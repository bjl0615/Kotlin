package com.example.kotlibasics


// Super class, Parent Class, Base Class
open class Vehicle{
    // properties
    // methods

}

// Super Class, Parent Class , Base Class of Vehicle
open class Car1(val name : String , val brand : String){

    open var range : Double = 0.0

    fun extendRange(amount : Double) {
        if(amount > 0)
            range += amount
    }

    open fun drive(distance : Double) {
        println("Drove for $distance KM")
    }
}

//Any class inherits from the Any Class

// Sub Class Child class or Dervied class of Car1,
class ElectricCar(name : String, brand : String, batteryLife : Double)
    : Car1(name,brand) {
        var chargerType = "Type1"
        override var range = batteryLife * 6

        override fun drive(distance : Double) {
            println("Drove for $distance KM on electriccity")
        }

        fun drive(){
            println("Drove for $range KM on electriccity")
        }
}

fun main() {
    var audiA3 = Car1("A3" , "Audi")
    var teslaS = ElectricCar("S-Model" , "Tesla" , 85.0)
    teslaS.chargerType = "Type2"
    teslaS.extendRange(200.0)

    teslaS.drive()

    // Polymorphism
    audiA3.drive(200.0)
    teslaS.drive(200.0)
}

