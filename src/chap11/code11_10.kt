package chap11

fun main() {
    val age = 14
    val message: String

    if (age in 13..15) {
        message = "中学生です"
    }else{
        message = "中学生ではありません"
    }
    println(message)
}
