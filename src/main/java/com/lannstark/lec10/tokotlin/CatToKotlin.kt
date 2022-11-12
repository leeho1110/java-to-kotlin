package com.lannstark.lec10.tokotlin

class CatToKotlin(
    species: String
) : AnimalToKotlin(species, 4) {

    override fun move() {
        println("고양이가 사뿐 사뿐 걸어가~")
    }
}