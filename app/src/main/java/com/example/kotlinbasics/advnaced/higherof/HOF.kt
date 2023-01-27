package com.example.kotlinbasics.advnaced.higherof

fun main(args: Array<String>) {
// expression without function name
    // {parameters of the functions-> return type}
    val callFun = { println("Happy Birthday") }
    println(callFun())
    callFun()

    //val add= {addNumbers(3,6)}
    val addLambda = { a: Int, b: Int -> a + b }
    println(addLambda(4, 6))

    val numbers = listOf(1, 3, 2, 1, 4, 5, 3, 0)
    val filteredNumbers = numbers.filter {
        it != 3
    }
    println(filteredNumbers)
}

//fun greetings(){
//    println("Happy Birthday")
//}
//
//fun addNumbers(a:Int, b:Int):Int{
//    println(a+b)
//    return a+b
//}