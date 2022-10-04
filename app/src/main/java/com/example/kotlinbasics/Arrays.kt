package com.example.kotlinbasics

fun main(){
   // val numbers:IntArray = intArrayOf(1,2,3,4,5,6)
   // val numbers = intArrayOf(1,2,3,4,5,6)
    val numbers = arrayOf(1,2,3,4,5,6)
    val numbers0 = doubleArrayOf(1.1,2.1,3.1,4.1,5.1)
    for (element in numbers){
        print(element)
    }
    val days = arrayOf("Sun","Mon","Tue","Wed","Thur")
    println(days.contentToString())

    print(numbers[0])
    //modify array
    println("\nInitial values ${numbers.contentToString()}")
    numbers[3] = 8
    numbers[4] = 9
    println("\nfinal values ${numbers.contentToString()}")

    val fruits = arrayOf(Fruit("apple", 2.5))
    for (fruit in fruits){
        print("${fruit.name}")
    }

}
data class Fruit(val name: String, val price: Double)