package com.example.kotlinbasics

data class User (val id: Long, var name: String)

fun main(){

    val user1= User(1, "Bravine")
    val namee = user1.name
    println(namee)

    user1.name = "Cheruiyot"

    val user2= User (2, "Kevin")

    println(user1==user2)

    println("User Details are $user1 and $user2")

    val Updateduser = user1.copy(name = "Bravine Cheruiyot")
        println(Updateduser)

    println(Updateduser.component1())// print user1 i.e, Bravine
    println(Updateduser.component2()) // print id 2

    // Deconstruction

    val (id,name) = Updateduser
    println("Id=$id and Name=$name")

}