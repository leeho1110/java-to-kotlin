package com.lannstark.lec12

fun main(){
    moveSomething(object : Movable { // 익명 클래스 생성 시 object: Type
        override fun move() {
            println("move")
        }

        override fun fly() {
            println("fly")
        }
    })
}

private fun moveSomething(movable: Movable){
    movable.move()
    movable.fly()
}