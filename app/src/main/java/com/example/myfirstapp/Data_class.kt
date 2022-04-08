package com.example.kotlibasics

data class User(val id : Long , var name : String) {

}

fun main() {
    val user1 = User(1, "D")

    user1.name = "Lee"
    val user2 = User(1, "Lee")

    println(user1.equals(user2))

    println("User Details : $user1")

    val updatedUser = user1.copy(name = "LeeBongjun")
    println(user1)
    println(updatedUser)

    println(updatedUser.component1()) // print 1
    println(updatedUser.component2()) // prints Denis Panjuta

    val (id, name) = updatedUser
    println("id=$id, name = $name")
}