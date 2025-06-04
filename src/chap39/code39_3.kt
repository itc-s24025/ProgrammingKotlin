package chap39


fun main() {
    val function1: (String) -> String = fun(x: String): String {
        return x + "ちゃん"
    }
    val function2: (String) -> String = fun(x: String) = x + "ちゃん"
    val function3: (String) -> String = { x -> x + "ちゃん" }
    // パラメーターが一つだったらitが使える
    val function4: (String) -> String = {it + "ちゃん"}

    println(function1("たけし"))
    println(function2("たけし"))
    println(function3("たけし"))
    println(function4("たけし"))
}