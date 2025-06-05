package chap40

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("どの言語でもありそうな方法")
    for (item in list) {
        println(item)
    }

    println("kotlin ラムダ式を使った方法")
    list.forEach {
        println(it)
    }

    println("kotlin メンバ関数を使った方法")
    // actionにリストの要素ひとつひとつを渡す
    list.forEach (::println)
}