package chap35

data class Person2(val name: String, val myNumber: Int)

fun main() {
    val p1 = Person10("たけし", 1234)
    val p2 = Person10("たけし", 1234)

    println("p1のハッシュコード: ${p1.hashCode()}")
    println("p2のハッシュコード: ${p2.hashCode()}")

    if (p1 == p2) {
        println("二人は同一人物です")
    }else{
        println("二人は別人です")
    }
    val personSet = setOf(p1, p2)
    println("personSet: $personSet")
}