package com.lannstark.lec10.tokotlin

abstract class AnimalToKotlin (
    protected val species: String,
    protected open val legCount: Int // If you want override property, should be `open`
) {
    abstract fun move()
}