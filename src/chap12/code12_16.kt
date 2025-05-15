package chap12

import kotlin.random.Random

fun main() {
    val score = Random.nextInt(0, 100)

    // if式 + range で実装してください
    // a が 0~59 なら D
    // a が 60~69 なら C
    // a が 70~79 なら B
    // a が 80~89 なら A
    // a が 90~ なら S

    val borderC = 60
    val borderB = 70
    val borderA = 80
    val borderS = 90

    val judge = when (score) {
        in 0..<borderC        -> "D"
        in borderC..<borderB  -> "C"
        in borderB..<borderA  -> "B"
        in borderA..<borderS  -> "A"
        else                     -> "S"
    }
    println("${score}の判定結果: ${judge}")
}

