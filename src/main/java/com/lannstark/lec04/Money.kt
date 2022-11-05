package com.lannstark.lec04

data class Money(
    val amount: Long
) {
    operator fun plus(money: Money): Money {
        return Money(this.amount + money.amount)
    }
}

fun main() {
    val money1000 = Money(1000L)
    val money2000 = Money(2000L)

    println(money1000 + money2000)
}