package chap38

fun main() {
    val c1 = getTextClosure("さん")
    val c2 = getTextClosure("くん")
    val c3 = getTextClosure("ちゃん")

    println(c1("たけし"))
    println(c2("たけし"))
    println(c3("たけし"))
}

fun getTextClosure(x: String): (String) -> String {
    return fun(name) = name + x
}