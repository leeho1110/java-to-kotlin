package com.lannstark.lec03

fun smartCast(obj: Any) {
    if (obj is Person) { // reason of smart case
        println(obj.age) // Smart Case
    }

    if (obj !is Person) {
//            println(obj.age) // obj cannot smart casted! whY? !is
    }
}

fun smartCastNullabe(obj: Any?) {
    val person = obj as? Person
    println(person?.age) // if obj is null, return null
}

fun stringInterpolation() {
    val text = "SomeText"
    val person = Person("퍼얼슨", 1)
    println("print Text From $text")
    println("print Text From ${person.age}")
}

fun stringWithMultipleLine() {
    val trimIndent = """
            abcd
            efgh
        """.trimIndent()
    println(trimIndent)
}

/**
 * Java.Object == Kotlin.Any
 * Java.void == Kotlin.Unit
 */
fun main(obj: Any) {
    smartCast(obj)
}
