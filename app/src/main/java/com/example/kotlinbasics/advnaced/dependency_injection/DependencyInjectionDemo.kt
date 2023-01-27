package com.example.kotlinbasics.advnaced.dependency_injection

class BadlyDesignedCar() {
    private val engine = FourCylinder()
    fun drive() {
        println("driving at the speed of " + engine.speed)
    }
}

class Car(private val engine: Engine) {
    fun drive() {
        println("driving at the speed of " + engine.speed)
    }
}

interface Engine {
    val speed: Int
}

class FourCylinder() : Engine {
    override val speed = 50
}

class V6() : Engine {
    override val speed = 80
}

fun main() {
    val badCar = BadlyDesignedCar()
    //can't change the engine dependency
    badCar.drive()
    println()

    val carWith4Cylinder = Car(FourCylinder())
    carWith4Cylinder.drive()
    //can change the engine dependency
    val carWithV6 = Car(V6())
    carWithV6.drive()
}
