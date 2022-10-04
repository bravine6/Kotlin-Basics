package com.example.kotlinbasics

fun main() {
//method 1
    val sum: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    println(sum(10, 5))

    //method 2
    val sum1 = {a:Int, b:Int -> println(a + b) }
    sum(11, 9)
}