package com.example.helloworld

import java.lang.IllegalArgumentException

fun main(){
    var myCar = Car()
    println("brand is : ${myCar.myBrand}")
    myCar.maxSpeed = -5
    println("Max Speed is : ${myCar.maxSpeed}")
}

open class Car() {
    lateinit var owner : String

    var maxSpeed: Int = 250
    //default get and set are created in the background when a var or val is called:
//        get() = field
//        set(value){
//            field = value
//        }
    set(value){
        field = if(value > 0) value else throw IllegalArgumentException("Max speed cannot be less than zero")
    }

    val myBrand: String = "BMW"
        // Custom getter
        get(){
            return field.lowercase()
        }

    var myModel : String = "M5"
        private set //can not set myModel anywhere else but the class. ex: cannot set it in the main fun

    init{
        this.myModel = "M3"
        this.owner = "frank"
    }
}