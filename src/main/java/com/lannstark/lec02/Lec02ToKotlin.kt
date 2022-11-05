package com.lannstark.lec02

import java.lang.NullPointerException

/**
 * Null Safety 를 보장하는 코틀린은 null이 들어갈 수 있는 타입은 기존 타입과 아예 다르게 취급된다.
 *
 * null이 가능한 타입을 다루는 기능은 2가지가 존재한다.
 *
 * - Safe Call (?.) ->   nullableVar?.{field}
 * - Elvis Operator (?:) -> nullableVar ?: {returnOrDoSomethingWhenLeftIsNull}
 */

fun startWithA1(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어왔습니다")
}

fun startWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startWithCertainlyNotNull(str: String?): Boolean {
    return str!!.startsWith("A") // str이 Null이 아니라는 것을 단언, 하지만 null이 들어오면 NPE
}

fun startWithCertainlyNotNullWithPlatformType(str: String): Boolean {
    return str.startsWith("A")
}

fun main() {
    val person = Person("str")
    // Type mismatch. cause it is @Nullable, Runtime NPE!
//    startWithCertainlyNotNullWithPlatformType(person.name)
}