package com.lannstark.lec08

fun main() {
    printAll("A", "B", "C")

    val strings = arrayOf("A", "B", "C")
    printAll(*strings)
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}