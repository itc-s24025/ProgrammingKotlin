package chap20

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("なにか入力してください")
    val line = scanner.nextLine()
    println(line)

    println("なにか入力してください空白はだめ")
    val string = scanner.next()
    println(string)

    println("整数を入力してください")
    val num = scanner.nextInt()
    println("$num の2倍の数 ${num * 2}")
}