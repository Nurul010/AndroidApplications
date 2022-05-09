package com.example.helloworld

// The class that inherits the features of another
// class is called the Sub class or Child class or
// Derived class,and the class whose features are
// inherited is called the Super class or Parent class
// or Base class.

interface Drivable{ // useful for declaring later functions and variables
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The drivable is braking")
    }
}

// Super Class, Parent Class, Base Class of Vehicle
open class car1(val name: String, val brand: String, override val maxSpeed: Double): Drivable{//need to declare open for other class to inherit
    open var range: Double = 0.0 // needs to be open for override in child class
    fun extendRange(amount: Double){
        if(amount > 0)
            range += amount
    }
    //override fun drive(): String = "driving the interface drive" -> same thing as below:
    override fun drive(): String {
        return "driving the interface drive"
    }
    open fun drive(distance: Double){
        println("Drove for $distance KM")
    }
}

// Sub Class Child class or Derived class of Car class,
class ElectricCar(name: String, brand: String, batteryLife: Double, maxSpeed: Double) : car1(name, brand,
    maxSpeed
){ // needs the same constructor as parent
    override var range = batteryLife * 5
    override fun drive( distance: Double){
        println("Drove for $distance Km on electricity")
    }

    //Cannot be used anymore since it is trying to override drive from inheritance in car:
//    fun drive(){
//        println("Drove for $range Km on electricity")
//    }

    override fun drive(): String{
        return "Drove for $range Km on electricity"
    }

    override fun brake(){
        //super.brake() // car did not call it so we need to call from superclass
        println("brake inside of electricity car")
    }
}

//Abstract Classes:
// An abstract class cannot be instantiated
// (you cannot create objects of an abstract class).
//However, you can inherit subclasses from an abstract class.
// The members (properties and methods) of an abstract class are non-abstract
// unless you explicitly use the abstract keyword to make them abstract.

//Differences Between Interface and Abstract class:
//Interfaces cannot have fields
//We can extend only one class, and implement multiple interfaces
//Abstract Classes have constructors


fun main(){
    var AudiA3 = car1("A3", "Audi", 200.0)
    var TeslaS = ElectricCar("s-Model", "Tesla", 85.0, 200.0)
    TeslaS.extendRange(200.0)
    AudiA3.drive(200.0)
    TeslaS.drive(195.0)
    //TeslaS.drive()
    println(TeslaS.drive())
    TeslaS.brake()
    AudiA3.brake()
}