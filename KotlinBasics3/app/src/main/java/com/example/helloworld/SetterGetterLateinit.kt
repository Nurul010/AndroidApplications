package com.example.helloworld

fun main(){
    var myCar = Car()
}

class Car() {
    lateinit var owner : String

    var maxSpeed: Int = 250
    //default get and set are created in the background when a var or val is called:
//        get() = field
//        set(value){
//            field = value
//        }

    val myBrand: String = "BMW"
        // Custom getter
        get(){
            return field.lowercase()
        }

    init{
        this.owner = "frank"
    }
}