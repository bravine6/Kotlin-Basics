package com.example.kotlinbasics

import android.graphics.ColorSpace.connect

fun main(){

   // myFunction()
   // var result = addUp(m:5,l:5)
    //argument
   // var result = addUp(m = 5,l = 6)
   // println("The result is $result")
    println(addUp(5,3))
    //myBreak()
    //var ave = average(k = 8, p = 5)
    //println("The result is $ave")
    println(average(18,5))
}
//Parameter (input)
fun addUp(m: Int,l: Int) : Int{

    return m+l
}
fun myFunction(){
    println("Called from myFunction")
}

fun average(k: Int, p: Int) : Int {
    return k / p
}

    fun myBreak(){
    for (io in 1 until 20){
        if (io / 2 == 5) {
            continue
            //break
        }
        print("$io")
    }
    println("Done with Loop")
    }




