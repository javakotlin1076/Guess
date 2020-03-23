package com.bobo.guess

import java.util.*

class SecretNumber{
    val secret=Random().nextInt(10)+1
    var count=0
    fun validate(number: Int):Int{
        count++
        return number-secret
    }
}

fun main() {
    val secretNumber=SecretNumber()
    println(secretNumber.secret)
//    println(secretNumber.validate(2))
    println("${secretNumber.validate(3)},count: ${secretNumber.count}")
}