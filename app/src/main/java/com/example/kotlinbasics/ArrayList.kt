package com.example.kotlinbasics

fun main (){
    val arrayList = ArrayList<String>()
    arrayList.add("one")
    arrayList.add("two")
    arrayList.add("three")
    arrayList.add("four")
    println(".....print ArrayList.....")
    println(arrayList)

    for (i in arrayList){
        println(i)
    }

    //ArrayList using collections
    val arrayList2: ArrayList<String> = ArrayList(5)
    var list: MutableList<String> = mutableListOf<String>()

    list.add("one1")
    list.add("two2")
    //add list to arraylist
    arrayList2.addAll(list)
    println(arrayList2)

    val itr = arrayList2.iterator()

    while (itr.hasNext()) {
        println(itr.next())
    }
    println("size of arrayList2 ="+arrayList2.size)

    //USING GET FUNCTION

    val arrayList3: ArrayList<String> = ArrayList<String>()
    arrayList3.add("One11")
    arrayList3.add("Two22")

    for (i in arrayList3){
        println(i)
    }
    println("......arrayList.get(i).......")
    println(arrayList3.get(1))
}