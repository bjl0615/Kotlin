package com.example.kotlibasics

fun main() {

    var name : String = "Denis"
    // name = null -> Compilation ERROR
    var nullableName : String? = "Denis"
    //nullableName = null

    var len = name.length
    var len2 = nullableName?.length
    nullableName?.let { println(it.length) }
    // 2.
    /*
    if(nullaableName != null){
        var len2 = nullaableName.length
    }else {
        null
    }
     */

}