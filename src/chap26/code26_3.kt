package chap26

import chap25.Person2

fun main() {
    val p = Person(7)
//    val p2 = Person(lastName = "鈴木", firstName = "タロウ")
}

class Person(val name: String, var age: Int) {
    init {
        println("プライマリコンストラクタのイニシャライズが呼ばれました。")
        println("指定されたパラメータは ${name} と ${age} です。")
    }
    constructor(age: Int) : this("名無しさん", age) {
        println("年齢だけを指定するセカンダリコンストラクタのイニシャライザが呼ばれました。")
    }
    constructor(lastName: String, firstName: String, age: Int) : this("$lastName $firstName", 20) {
        println("苗字と名前を指定するセカンダリコンストラクタのイニシャライザが呼ばれました。")
    }
}