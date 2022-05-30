package com.example.kotlibasics

fun main() {

    val months = listOf("January" , "February" , "March")
    val anyTypes = listOf(1,2,3,true,false,"String")
//    print(anyTypes.size)
//    print(months[1])

    val addionalMonths = months.toMutableList()
    val newMonths = arrayOf("April" , "May" , "June")
    val newMonths2 = arrayOf("July" , "August" , "September" , "October" , "November" , "December")
    addionalMonths.addAll(newMonths)
    addionalMonths.addAll(newMonths2)
//    addionalMonths.add("July")
//    print(addionalMonths)
    val days = mutableListOf<String>("Mon" , "Tue" , "Wed")
    days.add("Thu")
    print(days)
    days.removeAt(3)
    val removeList = mutableListOf<String>("Mon", "Wed")
//    days.removeAll(removeList)
    days.removeAll(days)
    print(days)
//    for(month in months){
//        println(month)
//    }
}