package com.lannstark.lec14

fun main() {

    val emptyList = emptyList<Int>()
    /**
     * public fun <T> listOf(vararg elements: T): List<T> =
     *  if (elements.size > 0) elements.asList() else emptyList()
     */
    val numbers = listOf(100,200) // default Immutable

    for (number in numbers) {
        println("number = ${number}")
    }

    for (withIndex in numbers.withIndex()) {
        println("withIndex.index = ${withIndex.index}")
        println("withIndex.value = ${withIndex.value}")
    }

    val mutableListOf = mutableListOf(100, 200)

    val mapOf = mapOf(1 to "one", 2 to "two")
    println("mapOf.get(1) = ${mapOf.get(1)}")

    /**
     * List<Int?> : 리스트는 null 불가능, Int는 null 가능
     *
     * List<Int>? : 리스트는 null 가능, Int는 null 불가능
     *
     * List<Int?>? : 리스트는 null 가능, Int는 null 가능
     */
}