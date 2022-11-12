package com.lannstark.lec10.tokotlin

class PenguinToKotlin(
    species: String
) : AnimalToKotlin(species, 2), SwimableToKotlin, FlyableToKotlin {

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 움직입니다~ 꿱꿱")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<SwimableToKotlin>.act()
        super<FlyableToKotlin>.act()

        /**
         * Implements해야할 인터페이스 메서드가 중복된 이름을 같는 경우
         *
         * `super<InterfaceName>.methodName()
         *
         * 을 통해 인터페이스를 특정할 수 있습니다.
         */
    }

    override val swimAbility: Int
        get() = 3
}
