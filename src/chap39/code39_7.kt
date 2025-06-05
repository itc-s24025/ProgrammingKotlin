package chap39

import java.util.Random

fun main() {
    val randomSuffix = nameString()
    println(randomSuffix("たけし"))
    println(randomSuffix("たけし"))
    println(randomSuffix("たけし"))
    println(randomSuffix("たけし"))
}

fun nameString() : (String)->String {
    // ↓からラムダ式
    // 最後の一文がreturn代わり
    return {
        val randomNumber = Random().nextInt(100)
        it + randomNumber
    }
}