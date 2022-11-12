package com.lannstark.lec17

/**
 * Q. Java에서 Lambda는 왜 나왔을까요?
 * A. 익명 클래스와 인터페이스를 활용한 코드를 대체하기 위해서
 *
 * Q. Kotlin에서의 함수는 Java와 어떻게 다른가요?
 * A. Kotlin에서는 함수가 그 자체로 1급 시민(First-class citizen)입니다. 반면 Java에서는 2급 시민이죠.
 *    즉 함수 자체를 변수에 넣거나, 파라미터로 전달할 수 있다는 의미입니다.
 *
 * Q. Closure란 무엇일까요?
 * A. Java에서는 Variable used in lambda expression should be final or effectively finall
 *    람다 밖에서 있는 변수 혹은 final이 아닌 변수는 람다식 내에서 사용이 불가능합니다.
 *
 *    하지만 Kotlin에서는 람다 시작 시점에 존재하는 변수들을 모두 '포획'하여 그 정보를 갖고 있습니다.
 *    즉 람다 실행 시점에 사용되는 변수들을 모두 포획환 데이터 구조를 'Closure' 라고 부릅니다.
 *
 *    결국 Closure 자료구조를 통해 non-final인 변수도 람다식에서 사용할 수 있습니다.
 */

val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
    return fruit.name == "사과"
}
val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사" }

private fun filterFruits(
    fruits: List<Fruit>,
    filter: (Fruit) -> Boolean
): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        results.add(fruit)
    }
    return results
}