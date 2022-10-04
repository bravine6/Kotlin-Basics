package com.example.kotlinbasics

fun main (){
    var deno = person ("Chebet" , "Kelo" , 31)
  //  println(deno)
    deno.stateHobby()

    var bravine = person()
    //var firstname: String? = null
}

class persons(firstname: String = "Bravine", secondname: String = "Cheruiyot"){
    // Member Variables - Properties
    var age : Int? = null
    var hobby : String = "Watch netflix"
    var firstname: String? = null

    //Initializer Block

    init {
        this.firstname= firstname
        println("Initialize a new person object with name")
        println("Intitialize withFirst name = $firstname  last name = $secondname")
    }
    //Member Secondary Constructor
    constructor(firstname: String , secondname: String, age: Int)
            :this (firstname,secondname){
                this.age= age
            }

    // Member Functions - Methods

    fun stateHobby(){
        println(" $firstname\'s hobby is $hobby")
    }
}