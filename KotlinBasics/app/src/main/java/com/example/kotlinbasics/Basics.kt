package com.example.kotlinbasics

fun main() {
    // TODO: Add new functionality
    //type "string"
    val myName = "Adam" //val cannot be reassigned
    var myName2 = "Adam" //var can be reassigned
    myName2 = "Eve"
    //type "int" 32 bit
    var myAge = 32

    //Integer TYPES: Byte (8 bit), Short (16 bit), Int (32 bit), Long (64 bit)
    //Explicitly typing cast:
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 13263545
    val myLong: Long = 312_555_698_236


    // Floating Point number Types: Float (32 bit), Double (64 bit)
    val myFloat: Float = 13.37F //F at the end is needed for float. else its considered a double
    val myDouble: Double = 3.1415926535897932384


    print("Hello " + myName2 + "\n")
    print("Hello $myName2 and the length of myStr is ${myName.length}\n") //called string template expression

    //Arithmetic operators (+, -, *, /, %)
    var result = 5 + 3
    var resultDouble: Double
    resultDouble = (result.toDouble() / 3.0)
    print(resultDouble)
    print("\n")

    //Comparison operators (==, !=, <, >, <=, >=)
    println("is-5greater3 ${5 > 3} \n")

    //Assignment operators (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3
    print(myNum)
    print("\n")
    //Increment & Decrement operators (++, --)
    print("myNum is ${++myNum} \n")

    if (false) {
        print("true\n")
    } else {
        print("false")
    }

    //when statement is basically a switch statement from c++
    var season = 3
    when (season) {
        1 -> println("Spring") //println has a built in endline
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        in 5..6 -> println("does not exist")
        7, 8 -> println("does not exist")
        !in 0..8 -> println("does not exist")
        else -> println("invalid season")
    }

    var x: Any = 13
    when (x) {
        is Int -> println("$x is an Int")
        is Double -> println("$x is a Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }

    //while loops
    x = 1
    while(x <= 10) {
        print("$x")
        x++
    }
    println("\nwhile loop is donel" )
    x = 15
    do{//runs at least once the first time
        print("$x")
        x++
    }while (x <= 10)
    println("\ndo while loop is done")

    //for loops
    println("..")
    for(num in 1..10){
        print("$num")
    }
    println("\nuntil")
    for(num in 1 until 10){
        print("$num")
    }
    println("\ndownTo in steps of 2")
    for(num in 10 downTo 1 step 2){// Same as - for(i in 10.downTo(1).step(2))
        print("$num")
        //break     -> used to breaks out of loop
        //continue  -> skips current iteration and goes to next iteration
    }


}