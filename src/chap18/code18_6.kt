package chap18

fun main() {
    // code18.5
    val x = mutableListOf("あ", "い", "う", "え", "お")
    println("追加前のコレクション内の要素数: ${x.count()}")
    println(x)
    x += "あ"
    x += "あ"
    x += "あ"
    println("追加後のコレクション内の要素数: ${x.count()}")
    println(x)

    println("------------")

    // code18.6
    val y = mutableSetOf("あ", "い", "う", "え", "お")
    println("追加前のコレクション内の要素数: ${y.count()}")
    println(y)
    y += "あ"
    y += "あ"
    y += "あ"
    println("追加後のコレクション内の要素数: ${y.count()}")
    println(y)

}