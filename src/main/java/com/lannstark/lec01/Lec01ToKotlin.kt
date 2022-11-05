package com.lannstark.lec01

fun main() {
    var number1 = 10L   // 가변
    println("number1 = ${number1}")

    val number2 = 10L   // 불변
    println("number2 = ${number2}")

    var numberCanBeNull: Long?
    val person = Person("최태현")

    /**
     * public final class Lec01ToKotlin {
     *      public final void main() {
     *          long number1 = 10L;
     *          long number2 = 10L;
     *      }
     *}
     *
     * 코틀린은 컴파일러가 타입 추론을 스스로 진행하기 때문에 보통 타입을 명시하지 않는다.
     * 초기화 후 위 변수를 보면 `Long` 타입으로 추론된 것을 확인할 수 있다.
     * 이펙티브 자바에서 언급되었듯 자바는 boxing, unboxing을 이유로 reference type 사용을 지양하도록 하는데
     * 코틀린에서는 디컴파일을 해보면 내부적으로 primitive를 사용한다.
     *
     * In Kotlin, everything is an object in the sense that you can call member functions and
     * properties on any variable. Some types can have a special internal representation
     * – for example, numbers, characters and booleans can be represented as primitive values at runtime –
     * but to the user they look like ordinary classes.
     *
     * by https://kotlinlang.org/docs/basic-types.html
     */
}