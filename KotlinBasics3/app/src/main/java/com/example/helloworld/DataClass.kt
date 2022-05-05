package com.example.helloworld

data class User(val id: Long, var name: String)

fun main(){
    val user1 = User(1, "Adam")//create user object
    println(user1.name)
    user1.name = "Michael" //update name
    val user2 = User(1, "Michael")

    println( user1.equals(user2)) //( user1.equals(user2)) same thing as (user1 == user2)

    val updatedUser = user1.copy(name="Eve") // copy user1
    println(user1)
    println(updatedUser)

    println(updatedUser.component1()) // prints 1
    println(updatedUser.component2()) // prints eve

    val(id,name) = updatedUser
    println("id = $id, name=$name")

}