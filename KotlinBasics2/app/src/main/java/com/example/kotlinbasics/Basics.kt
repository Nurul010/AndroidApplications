package com.example.kotlinbasics

fun main() {
    myFunction()
    var result = addUp(5,3)
    println("Result is $result")
    var result2 = avg(5.3,13.37)
    println("Result is $result2")
}

// Method - a Method is a Function within a class
// usually a method is used instead of a function

// Parameter (input)
fun addUp (a: Int, b: Int) : Int{
    // output
    return a+b
}

fun avg(a: Double, b: Double): Double{
    return (a+b)/2
}

fun myFunction(){
    println("myFunction Called")
}