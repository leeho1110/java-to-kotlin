package com.lannstark.lec12

class PersonToKotlin(
    var name: String,
    val age: Int
) {
    companion object {
        /**
         * with const: 컴파일 타임에 할당, non-const: 런타임 타임에 할당
         */
        val MIN_AGE: Int = 1

        @JvmStatic // Java에서 Companion없이 호출 가능
        fun newBabyJvmStatic(name: String) = PersonToKotlin(name, MIN_AGE)

        fun newBaby(name: String) = PersonToKotlin(name, MIN_AGE)
    }

    /**
     * static: 클래스의 인스턴스화 시 값 복제가 아닌 정적으로 인스턴스끼리 값을 공유하는 공유 자원
     * companion object: 클래스와 함께 움직이는 '진짜' 객체
     *  - 클래스와 동행하는 유일한 오브젝트
     *  - 네이밍, interface 구현도 가능
     */
}

/**
 * Singleton Object in Kotlin
 */
object IamSingleton{
    var a: Int = 0
}