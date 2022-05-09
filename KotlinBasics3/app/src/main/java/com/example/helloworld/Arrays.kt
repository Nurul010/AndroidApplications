package com.example.helloworld

fun main(){
    //val numbers: IntArray = intArrayOf(1,2,3,4,5,6)

    //val numbers = intArrayOf(1,2,3,4,5,6)

    val numbers = arrayOf(1,2,3,4,5,6) //arrayOf is a class

    println(numbers.contentToString()) //numbers returns the pointer so it cannot print by itself

    println(numbers[0])
    numbers[0] = 9
    println(numbers[0])

    for (element in numbers){
        print(element+2)
    }

    println()
    val days = arrayOf("sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday")
    println(days.contentToString())
    val fruits = arrayOf(Fruit("apple", 2.5), Fruit("orange", 3.0))
    println(fruits.contentToString())

    for (index in fruits.indices){//gives index
        println("${fruits[index].name} is in index $index")
    }

    for (fruit in fruits) {//same thing but does not give index
        print(" ${fruit.name}")
    }

    println()
    val mix = arrayOf("sunday", 3, "tuesday", 2.6, Fruit("apple", 2.5), "friday", "saturday")
    println(mix.contentToString())
}

data class Fruit(val name: String, val price: Double)