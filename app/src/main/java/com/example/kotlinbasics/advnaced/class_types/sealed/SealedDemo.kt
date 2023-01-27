package com.example.kotlinbasics.advnaced.class_types.sealed

sealed class SealedDemo(val name: String, val id: Int) {
    object SealedClassChild1 : SealedDemo("Tom", 1)
    object SealedClassChild2 : SealedDemo("Dan", 2)
    object SealedClassChild3 : SealedDemo("Mike", 3)
}

fun main() {
    println(SealedDemo.SealedClassChild1.name)
    println(SealedDemo.SealedClassChild2.id)
    println(SealedDemo.SealedClassChild3.name)
}