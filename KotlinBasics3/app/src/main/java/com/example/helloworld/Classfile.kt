package com.example.helloworld

fun main(){
    var Adam = Person("Adam", "Sandler", 31) //Object
    //var Adam : Person = Person("Adam", "Sandler") // same thing
    Adam.hobby = "to Skateboard"
    Adam.stateHobby()
    Adam.age = 32
    println("${Adam.firstName}\'s age is ${Adam.age}")
//    var John = Person() //Object

//    var JohnPeterson = Person(lastName = "Peterson") //Object
}

class Person (firstName: String = "John", lastName: String = "Doe"){
    // Member variables
    var age : Int? = null
    var hobby : String = "Watch Netflix"
    var firstName : String? = null

    init{
        this.firstName = firstName //stateHobby cannot use firstname without this line since firstname is out of scope for stateHobby
        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
    }
    // Member Secondary Constructor
    constructor (firstName: String, lastName: String, age: Int) : this(firstName, lastName){
        this.age = age
        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName and age $age")
    }

    //Member Functions - Methods
    fun stateHobby(){
        println("$firstName\'s hobby is $hobby")
    }
}