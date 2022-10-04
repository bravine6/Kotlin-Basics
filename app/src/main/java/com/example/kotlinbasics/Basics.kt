package com.example.kotlinbasics

fun main(){


   // var h2= "kevin"
    //val h3 = "bryan"
    val mystrin ="Hello World"
    var mylength = mystrin.length
    var FirstCharacter = mystrin[0]
    var LastCharacter = mystrin[mystrin.length - 2]

    //print("First Character $FirstCharacter length of my string is ${mystrin.length}")

    //arithmethic operators
    var result= 8*2
    result %= 2
    print(result)

    //comparison operators
    var isequal = 5==3
    //print("is equal to $isequal")

    val v2 = 5!=4
   // println("is equal to $v2")
   // println("is 5 lesser than 3 ${5<3}")

    // Assignment operators
    var myNum = 5
    myNum +=3
   // println("my num is  $myNum")
    myNum *=4
   // println("my num is $myNum")

    //Increment and Decrement Operators
     myNum++
   // println("my num is $myNum")
    myNum--
   // println("my num is $myNum")

    //If Statements

    val age = 22

    if (age>=21){
       // println("You may drink in the US")
    }else if (age>=18){
        //println("You may vote")
    }else if (age>16) {
       // println("You may drive")
    } //else (println("Too YOUNG"))

     var israiny = true
    if (israiny){
      //  println("Its rainy")
    }
     // WHEN
    when(age){
    // in 21..150 -> print("You may drink in the US")
      //  !in 0..20 -> println("You may drink in the US")
      //  in 18..20 -> print("You can Vote")
     //   16, 17 -> print("You may Drive")
     //   else -> print("You are too young")
    }
    //IS ARRAY
    var x : Any = 13.33
    when(x){
     //   is Int -> println("$x Its an Integer")
     //   is Double -> println("$x It is a double")
    //    !is Double -> println("$x not a double")
     //   is String -> println("$x It is a string")
   //     else -> println("$x Its none of the above")
    }
    var d= 1
    while (d <= 10){
       // println("$d")
       d++
        //d -=2
    }
   // println("While loop is done")

    // DO WHILE LOOP

    do {
       // println("$d")
    }while (d <= 10)
   // println("do while loop is done")


    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp =="cold"){
        roomTemp++
        if (roomTemp >= 20){
            feltTemp = "comfy"
          //  println("Its comfy now")
        }
    }
    // FOR LOOPS
    for (num in 1..10){
       //print("$num")
            }

    for (n in 10 downTo 1)
      //  print("$n")

    //EXCERCISE ON LOOPS
 //A
    for (num in 0..10000){
        if(num == 9001){
      //      print("IT'S OVER 9000!!!")
        }
    }
//B
    var humidity = "humid"
    var humidityLevel= 80
    while (humidity == "humid"){
        humidityLevel -= 5
     //   println("humidity decreased")
        if (humidityLevel <= 60)
            humidity = "comfy"
    //    println("It's comfy now")
    }

    var xe = 0
    for (y in 0..9){
        xe += y
    }
    println("$xe")

}