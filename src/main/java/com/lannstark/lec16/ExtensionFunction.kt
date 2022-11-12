package com.lannstark.lec16

/**
 * Java와의 호환을 위해, 함수는 클래스 바깥에 선언되어 있지만 해당 클래스처럼 사용하기 위해 나왔다.
 *
 * - 하지만 원본 클래스의 public, private 멤버 변수에 대한 접근은 불가능하다.
 * - 동일한 시그니처가 존재한다면 멤버 함수가 확장 함수보다 높은 우선순위를 가진다.
 */
fun String.myCustomLastChar(): Char = this[this.length-1]

/**
 * DSL처럼 함수와 인자의 순서가 아래처럼 사용할 수 있는
 */
infix fun Int.add(other: Int) = this + other
fun main(){
    val i = 3 add 4
    println("i = ${i}")
}