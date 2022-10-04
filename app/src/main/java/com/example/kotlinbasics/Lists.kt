package com.example.kotlinbasics

fun main (){
    val months = listOf("January", "February", "March")
    val anyTypes = listOf(1,2,3,true,"String")
   // println(months)
   // println(anyTypes)
    for(month in months){
        println(month)
    }
    //add months to immuttable list
    val additionalMonths = months.toMutableList()
    val newMonths = arrayOf("April", "May", "June")
    additionalMonths.addAll(newMonths)
    //can add additional Month
    additionalMonths.add("July")

    println(additionalMonths)

    //muttable list
    val days = mutableListOf<String>("Mon", "Tue", "Wed")
    //override
    days[2] = "Sat"
    //remove
    days.removeAt(3)
    days.add("Thur")
    println(days)

}