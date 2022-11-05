package com.lannstark.lec04

fun main() {
    val money1 = JavaMoney(1000L)
    val money2 = JavaMoney(1000L)

    println(money1 === money2) // compare identity
    println(money1 == money2) // compare equality

    /**
     * Java Lazy 연산
     *
     * if(returnTrue() || returnFalse()){ -> returnTrue()에서 true가 반환하자마자 뒤 조건식을 확인하지 않는다
     *      doSomething()
     * }
     */
}


