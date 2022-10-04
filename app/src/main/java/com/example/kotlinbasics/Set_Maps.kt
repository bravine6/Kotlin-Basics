package com.example.kotlinbasics

fun main(){

    val fruitts = setOf("Orange", "Apple", "Grape","Mango", "Orange", "Apple")

    println(fruitts)
    println(fruitts.size)

    println(fruitts.toSortedSet())

    //MUttable list
    val newFruits = fruitts.toMutableList()
    newFruits.add("Melon")
    newFruits.add ("Peer")
    println(newFruits.elementAt(4))

    println(newFruits)

    //Map
    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "wed")
    println(daysOfTheWeek)
    println(daysOfTheWeek[2])

    for (key in daysOfTheWeek.keys){
        print("$key is to ${daysOfTheWeek[key]}")
    }

    val fruitsMaps = mapOf("Favourite" to Fruiit("Grape", 2.6)
        , "Ok" to Fruiit("Apple", 1.1))

    val newDaysOfWeek = daysOfTheWeek.toMutableMap()
    newDaysOfWeek[4] = "Thur"
    newDaysOfWeek[5] = "Frid"

    //Sort A Map

    println(newDaysOfWeek.toSortedMap())

}
data class Fruiit(val name: String, val price: Double)
