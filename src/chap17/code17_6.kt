package chap17

fun main() {
    // Array(配列)は再代入できる 要素数は変更できない
    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = 4

    // listは再代入できない 要素数は変更できない
    val y: List<Int> = listOf(1, 2, 3)
//    y[0] = 4
}