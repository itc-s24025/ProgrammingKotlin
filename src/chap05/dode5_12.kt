package chap05

import jdk.internal.org.jline.utils.Colors.h

fun main() {

    val message1 = """
        |こんにちは世界
        |私はことりんに関して勉強しています
    """.trimMargin()
    println(message1)

    val message2 = """
        こんにちは世界
        私はことりんに関して勉強しています
    """.trimIndent()
    println(message2)
}