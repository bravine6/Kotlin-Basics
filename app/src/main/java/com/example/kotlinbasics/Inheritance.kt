package com.example.kotlinbasics
//This has the lecture 65 on interfaces
//Supper Class/Parent Class// Base Class of Vehicle
open class Vehicle(){
    //properties
    //methods
}

interface Drivable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The drivable is braking")
    }
}
// Sub class Child class or Derived Class of Vehicle
// Supper Class/Parent Class// Base Class of electricCar
open class Cars(override val maxSpeed: Double,
                name: String, brand:String): Drivable{
  open var range: Double = 0.0

    fun extendRange(amount: Double){
        if (amount > 0)
            range += amount
    }

    override fun drive(): String {
        return "driving the interface drive"
    }

    open fun drive(distance: Double){
        println("Drove for $distance KM")
    }

}
class electricCar(maxSpeed: Double, name: String, brand: String,
                  batteryLife: Double)
      : Cars(maxSpeed, name, brand){

    var chargerType = "Type2"
    val musicSystem = "Sonny"
    override var range = batteryLife * 5

    override fun drive (distance: Double){
        println("Drove for $distance KM on electricity")
    }
    override fun drive(): String{
        return ("Drove for $range KM on electricity")
    }

    override fun brake() {
        super.brake()
    }
}

fun main(){
    var AudiA3= Cars(200.0,"A3", "Audi")
    var TeslaS = electricCar(240.0,"S-Model", "tesla", 90.0)

    TeslaS.extendRange(200.0)
    TeslaS.chargerType
    TeslaS.musicSystem
    TeslaS.drive()

    TeslaS.brake()
    AudiA3.brake()

// Polymorphism
    AudiA3.drive(200.0)
    TeslaS.drive(200.0)
}