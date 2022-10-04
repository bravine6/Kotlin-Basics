package com.example.kotlinbasics

fun main (){
 var myCar = Car()
  myCar.owner
    println(myCar.myBrand)
}
class Car(){

  lateinit var owner: String

  var myBrand: String = "BMW"
     get() {
         return field.toLowerCase()
              }

    var maxSpeed: Int = 240
    get() = field
        set(value) {
        field = if ( value< 0) value else throw IllegalAccessException ("MaxSpeed Cannot be less than 0")

    }
  init {
      this.owner = "Frank"
  }

}