package chap20

fun main() {
    println("名前を入力してください")
    val name = readLine()
    println("年齢を入力してください")
    val age = readln().toInt()

    println("Hello, $name ! You are $age years old")
}