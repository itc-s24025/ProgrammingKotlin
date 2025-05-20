package chap17

fun main() {
    val a: MutableList<String> = mutableListOf(
        "こんにちは", "kotlin", "どうぞ", "よろしく"
    )
    a.removeAt(2)
    for ((i, x) in a.withIndex()) {
        println("${i} : $x")
    }
}