package com.lannstark.lec18_20

import com.lannstark.lec03.Person
import com.lannstark.lec12.PersonToKotlin

fun getNumberOrNullTakeIf(number: Int): Int? = number.takeIf { it <= 0 }
fun getNumberOrNullTakeUnless(number: Int): Int? = number.takeUnless { it <= 0 }

/**
 * Scope Funciton
 * 람다를 사용해 일시적인 영역을 만들어 코드를 간결하게 만들거, method chaining에 활용하는 함수
 *
 * - let(it), run(this): 람다의 결과를 반환
 * - also(it), apply(this): 호출된 객체 자신을 반환
 *
 * - it: 생략이 불가능한 대신 다른 이름을 붙일 수 있다. it은 파라미터에 일반 함수를 받고, 이 파라미터(함수) 호출을 하기 때문에 직접 이름을 지정해줄 수 있다.
 *  ```
 *  public inline fun <T, R> T.let(block: (T) -> R): R {
 *  ```
 * - this: 생략이 가능한 대신 다른 이름을 붙일 수 있다. 파라미터에 확장 함수를 받고, 이는 this로 본인 자신을 호출할 수 있지만 생략이 가능하다.
 *  ```
 *  public inline fun <T, R> T.run(block: T.() -> R): R {
 *  ```
 */

fun printPerson(person: Person?) {
    /**
     * let: null이 아닐 때 실행시키고 싶은 코드가 있을 때
     * ```
     * public inline fun <T, R> T.let(block: (T) -> R): R {
     * ```
     */
    person?.let {
        println(it.name)
        println(it.age)
    }

    if (person != null) {
        println(person.name)
        println(person.age)
    }


    /**
     * # let
     * - NON-NULL 값에 대해서만 code block을 실행시킬 때
     */
    val ageByLet = person?.let { it.age }

    /**
     * # run
     * - 객체 초기화와 반환값 계산을 동시에 해야할 때 ex) 객체를 생성해 DB에 저장하고 바로 이 인스턴스를 활용할 때
     */
    val ageByRun = person?.run { this.age }

    /**
     * # apply, also
     * - 객체 그 자체가 반환되는 특징
     * - 객체 설정 시 만약 객체를 수정하는 로직이 call chain 중간에 필요한 경우 ex) Test Fixture
     */
    val personByAlso = person?.also { it.age }
    fun createPerson(
        name: String,
        age: Int,
        newName: String
    ): PersonToKotlin = PersonToKotlin(
        name = name,
        age = age
    ).apply { this.name = newName }

    val personByApply = person?.apply { this.age }

    /**
     * # with
     * - 특정 객체를 다른 객체로 변환해야하는데 모듈간 의존성에 의해 정적 팩토리 또는 toClass 함수를 만들기 어려울 떄
     */
}