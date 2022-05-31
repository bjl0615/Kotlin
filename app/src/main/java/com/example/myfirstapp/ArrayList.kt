package com.example.kotlibasics

fun main() {
    val arrayList = ArrayList<String>()
    arrayList.add("One")
    arrayList.add("Two")
    println(".......print ArrayList.......")
//  1
    for(i in arrayList) {
        println(i)
    }
    println("-------arrayList.get(1)......")
    println(arrayList.get(1))
    // 2
//    var itr = arrayList.iterator()
//    while(itr.hasNext()) {
//        println(itr.next())
//    }
//    println("size of arrayList = " + arrayList.size)
}