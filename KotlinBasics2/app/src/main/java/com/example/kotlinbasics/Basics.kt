package com.example.kotlinbasics

fun main() {
    // functions
    myFunction()
    var result = addUp(5,3)
    println("Result is $result")
    var result2 = avg(5.3,13.37)
    println("Result is $result2")


    // nullables/optionals

    var nullableName : String? = "Nurul" //add ? after casting type to make it nullable
    //nullableName = null //can set variable to null
    var len = nullableName?.length //same as if statement below

    //    if(nullableName != null){
//        var len = nullableName.length
//    }else {
//        null
//    }
    nullableName?.let{ println(it.lowercase()) } // if not null, let it run println(it.length)

    // ?: is the Elvis operator
    val name = nullableName ?: "jimmy" // if nullableName is null, use default string "jimmy"
    println("name is $name")
    // an example in real world:
    //val wifesAge: String? = user?.wife?.age ?: 0

    // !! used to convert nullable to non-nullable
    println(nullableName!!.lowercase())

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