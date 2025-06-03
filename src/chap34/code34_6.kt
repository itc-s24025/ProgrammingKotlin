package chap34

import kotlin.math.sqrt

fun main() {
    val number1 = null
    val number2 = 10

    printCubicSquareRoot(number1)
    printCubicSquareRoot(number2)
}

fun printCubicSquareRoot(num: Int?) {
    // 数を3乗して平方根を求める
    // null許容型ははじめにnullを判定する
    if(num == null) {
        println("nullなので何もしない")
        return
    }
    // 上の処理を通ってきたということはnumはnullではないので
    // int に変換される 計算することができる
    val result = sqrt((num * num * num).toDouble())
    println("${num}を3乗した数の平方根は${result}です")
}