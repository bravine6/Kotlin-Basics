package com.example.kotlinbasics

fun main(){
    val arrayList4 = ArrayList<Double>()
    arrayList4.add(10.0)
    arrayList4.add(20.0)
    arrayList4.add(30.0)
    arrayList4.add(40.0)
    arrayList4.add(50.0)
    var total = 0.0

    for (i in arrayList4){
        total += i
    }
    var average = total / arrayList4.size
    println("Average is " + average)

}