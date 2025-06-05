package chap40

class Person(val name: String, val age: Int) {
    fun greet() {
        println("$name です $age 歳です")
    }
    fun displayName(): String {
        return "${name}($age)"
    }
}
fun main() {
    val p1 = Person("たけし", 5)
    val p2 = Person("けんた", 5)
    val p3 = Person("ゆみ", 8)
    val list = listOf(p1, p2, p3)
//    val pMax = list.maxBy { p -> p.age }
    val pMax = list.maxBy (Person::age)
    // Person::age -> fun(p1:Person) = p1.age
    println("最年長なのは誰")
    pMax.greet()
    // PersonクラスのdisplayName関数
    // Person::displayName ==> fun(p1:Person) = p1.displayName
    val getPersonDisplayName = Person::displayName
    println(getPersonDisplayName(pMax))
}