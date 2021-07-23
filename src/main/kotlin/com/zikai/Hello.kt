package com.zikai

fun main() {
//    println("Hello world")
    val h = Hello()
    h.Human()
    var age : Int = 25;
    age = age.plus(1)
    val weight = 65.5
    val enroll : Boolean = true
    println(age)
}

class Hello {
    fun Human() {
        println("Hello world")
    }
}