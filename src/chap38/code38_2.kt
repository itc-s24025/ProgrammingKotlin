package chap38

fun main() {
    var x = ""

    x = "さん"
    val c1 = fun(name: String) = name + x

    x = "くん"
    val c2 = fun(name: String) = name + x

    x = "ちゃん"
    val c3 = fun(name: String) = name + x

    println(c1("たけし"))
    println(c2("たけし"))
    println(c3("たけし"))
}