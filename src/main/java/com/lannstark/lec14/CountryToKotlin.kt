package com.lannstark.lec14

fun handleCountry(country: CountryToKotlin){
    when(country){
        CountryToKotlin.KOREA -> TODO()
        CountryToKotlin.AMERICA -> TODO()
    }
}

enum class CountryToKotlin(
    private val code: String
){
    KOREA("ko"),
    AMERICA("US");
}

/**
 * Q. 왜 Sealed Class,Interface 가 생겼을까요?
 *
 * sealed는 '봉인한' 이라는 의미가 있습니다. \
 * 만약 추상클래스를 만든다면 Java에서는 하위 클래스가 생기는 것을 막을 수 없습니다.
 * 하지만 이런 확장을 막고 싶다면 어떻게 해야 할까요?
 *
 * Sealed Class, Interface는 이런 하위 클래스의 확장을 금지합니다.
 * 컴파일 타임에 하위 클래스 타입을 기억합니다.
 */