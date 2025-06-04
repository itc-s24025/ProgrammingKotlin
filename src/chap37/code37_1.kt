package chap37

import kotlin.random.Random

fun main() {
    val p = ::calulatePlus
    val m = ::valulateMinus
    printRandomValuesCalculation(p)
    printRandomValuesCalculation(m)
}
fun calulatePlus(x: Double, y: Double) = x + y
fun valulateMinus(x: Double, y: Double) = x - y

// double型とdouble型を受取りdouble型を返す変数がほしいって言ってる
fun printRandomValuesCalculation(calculator: (Double, Double) -> Double) {
    val x = Random.nextDouble()
    val y = Random.nextDouble()
    val result = calculator(x, y)
    println("計算結果は${result}です")
}
