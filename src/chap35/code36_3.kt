package chap35

fun main() {
    val p = Person()
    p.setNameAndAge("たけし", 5)
    p.greet()
}

class Person {
    var name: String = ""
    var age: Int = 0

    fun setNameAndAge(name: String, age: Int) {
        this.name = name
        this.age = age
    }
    fun greet() {
        println("${name}です${age}歳です")
    }
}