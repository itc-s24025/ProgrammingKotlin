package chap39

fun main() {
    val list = listOf("あ", "い", "う", "え", "お")
    val action = fun(x: String) {
        println(x)
    }

    // forEach()の中身に関数を指定する必要がある ラムダ式が使える
    // forEach break使えない
    list.forEach(action)

    list.forEach { println(it) }
}