package com.lannstark.lec09

class JavaPersonToKotlin(
    /**
     *     Primary constructor 는 반드시 존재해야 합니다.
     *     field + getter + setter -> property
     */
    name: String,
    var age: Int,
) {

    val name = name
        get() = field.uppercase()

    /**
     * Q. 왜 프로퍼티에 Custom getter를 사용하면 `field`를 사용해야 할까요?
     *
     * A. 만약 프로퍼티 이름을 사용하면 무한 순환 참조가 발생합니다.
     * 외부에서 name을 참조하면 getter가 호출됩니다.
     * 하지만 getter는 내부의 name을 다시 호출하고, 이는 다시 getter를 호출하게 됩니다.
     *
     * 이렇게 name과 getter 사이에 무한 참조가 발생합니다.
     * 따라서 자기 자신을 가리키는 field 예약어를 사용해야 합니다.
     * 이런 필드를 자기 자신을 가리키는 보이지 않는 field, Backing field라고 합니다.
     */

    init {
        if (age <= 0) throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
    }

    /**
     * Second constructor 는 최종적으로 Primary constructor 를 호출합니다.
     * 하지만 실제로 호출될 때는 secondary부터 primary까지 타고 올라간 뒤
     * Primary -> Second 차례로 동작합니다.
     *
     * 하지만 Secondary보다는 Default Parameter를 권장합니다.
     * 만약 객체를 다른 객체로 변환하는 작업이라고 해도 정적 팩토리 메서드를 사용하는 것이 좋습니다.
     */
    constructor(name: String) : this(name, 1)

    /**
     * Custom getter, 실제로는 Expression이지만 getter를 통해 프로퍼티처럼 보이게 합니다.
     */
    val isAdult: Boolean
        get() = this.age >= 20
}

fun main(){
    val isAdult = JavaPersonToKotlin("이름", 1).isAdult
    println("isAdult = ${isAdult}")

}