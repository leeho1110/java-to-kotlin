package com.lannstark.lec14

sealed class HyundaiCar(
    val name: String,
    val price: Long
)

class Avante: HyundaiCar("아반떼",1000L)
class Sonata: HyundaiCar("소나타",2000L)
class Poter: HyundaiCar("포터",2000L)

fun main(){
    handleCar(Avante())
}

fun handleCar(car: HyundaiCar){
    when(car){
        is Avante -> println("아반떼!")
        is Sonata -> println("소나타!")
    }
}