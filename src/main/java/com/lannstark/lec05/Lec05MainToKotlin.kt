package com.lannstark.lec05

fun judgeNumber2(number: Int) {
    when{
        number == 0 -> println("주어진 숫자는 0입니다")
        number %2 == 0 -> println("주어진 숫자는 짝수입니다")
        else -> println("주어지는 숫자는 홀수입니다")
    }
}

fun getGradeWith(score: Int): String {
    return when(score) {
        90 -> "A"
        in 80..90 -> "B"
        else -> "F"
    }
}

fun startWithA(str: Any): Boolean {
    return when(str){
        is String -> str.startsWith("A")
        else -> false
    }
}
