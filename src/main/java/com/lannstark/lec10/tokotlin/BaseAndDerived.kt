package com.lannstark.lec10.tokotlin

fun main(){
    Derived(300)

    /**
     * # 실행순서
     * 1. BaseToKotlin init
     *      - Accessing non-final property number in constructor
 *          - number이 0이 출력된다. 왜?
     *      - 상위 클래스의 constructor, init 블록에서는 하위 클래스의 프로퍼티에 접근해서는 안된다.
     * 2. Derived init
     *      - 300을 넣어 상위 클래스에 선언한 기본값을 갖고 있지 않으므로
     *      - 상위 클래스의 init 블록에서는 Int 기본값인 상태로 넘어간다.
     */
}

open class BaseToKotlin(
    open val number: Int = 100 // Constructor parameter is never used as a property
) {
    init {
        println("Base Class")
        println(number) // Accessing non-final property number in constructor
    }
}

class Derived(
    override val number: Int
): BaseToKotlin(number) {
    init {
        println("Derived Class")
    }
}