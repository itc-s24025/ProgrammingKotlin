package chap39

import kotlin.random.Random

fun main() {
    randomNumberCalculate (6) {
        it * 2
    }
    randomNumberCalculate(100) {
        // 最後に変数を書くことで return cubic としている
        // このような書き方をするには関数型のパラメータは最後に指定しなければならない
        val square = it * it
        val cubic = square * it
        cubic
    }
}

fun randomNumberCalculate(max: Int, calculator:(Int) -> Int) {
    val targetNumber = Random.nextInt(max + 1)
    val result = calculator(targetNumber)
    println("計算結果: $result")
}
