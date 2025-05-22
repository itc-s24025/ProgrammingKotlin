package chap50

fun main() {
    val a = listOf(
        "こんにちは", "kotlin", "どうぞ", "よろしく"
    )

    println("forEach使う方法1")
    a.forEach {
        println(it)
    }

    println("forEachを使う方法2")
    a.forEach(
        ::println
    )
}