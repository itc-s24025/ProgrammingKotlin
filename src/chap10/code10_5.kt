package chap10

import kotlin.math.max

fun main() {
    // 0以上10以下
    val rangeA = 0..10
    println("10 in rangeA: ${10 in rangeA}")

    // 0以上10未満
    val rangeAa = 0..<10
    val rangeAaa = 0..10 - 1
    val rangeAaaa = 0 until 10
    println("10 in rangeAa: ${10 in rangeAa}")
    println("10 in rangeAaa: ${10 in rangeAaa}")
    println("10 in rangeAaaa: ${10 in rangeAaaa}")

    val max = 5
    val rangeB = 0..max
    println("5 in rangeB: ${5 in rangeB}")
}
