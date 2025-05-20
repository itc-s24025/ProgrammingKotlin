package chap17

fun main() {

    // 再代入も要素数の変更も可能
    val a: MutableList<String> = mutableListOf("こんにちは", "kotlin", "よろしく")
    for ((i, x) in a.withIndex()) {
        println("${i} : $x")
    }
    println("-------------")
    a.add(2, "どうぞ") // index2にねじ込む
//    a.add("お願いします")
    a += "お願いします"                 // 末尾に追加
    for ((i, x) in a.withIndex()) {
        println("${i} : $x")
    }
}