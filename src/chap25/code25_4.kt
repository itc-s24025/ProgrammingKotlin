package chap25

fun main() {
    val p = Person("たけし", 5)
    p.greet()
}

class Person (val name: String = "", var age: Int = 0) {
    fun greet() {
        println("$name です。 $age 歳です")
    }
}