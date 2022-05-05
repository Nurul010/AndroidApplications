package com.example.helloworld

// The class that inherits the features of another
// class is called the Sub class or Child class or
// Derived class,and the class whose features are
// inherited is called the Super class or Parent class
// or Base class.

//super class, parent class, base class
open class Vehicle(){ //need to declare open for other class to inherit
    // properties
    // methods
}

// Sub Class Child class or Derived class of Vehicle,
// Super Class, Parent Class, Base Class of Vehicle
open class car1(val name: String, val brand: String){
    open var range: Double = 0.0 // needs to be open for override in child class
    fun extendRange(amount: Double){
        if(amount > 0)
            range += amount
    }
    open fun drive(distance: Double){
        println("Drove for $distance KM")
    }
}

// Sub Class Child class or Derived class of Car class,
class ElectricCar(name: String, brand: String, batteryLife: Double) : car1(name, brand){ // needs the same constructor as parent
    override var range = batteryLife * 5
    override fun drive( distance: Double){
        println("Drove for $distance Km on electricity")
    }

    fun drive(){
        println("Drove for $range Km on electricity")
    }
}

fun main(){
    var AudiA3 = car1("A3", "Audi")
    var TeslaS = ElectricCar("s-Model", "Tesla", 85.0)
    TeslaS.extendRange(200.0)
    AudiA3.drive(200.0)
    TeslaS.drive(195.0)
    TeslaS.drive()
}