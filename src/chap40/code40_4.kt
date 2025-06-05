package chap40

class Person2(val name: String, val age: Int) {
    // クラス内の関数（メソッド）で ::メソッド名 とすると
    // そのメソッドを実行しているインスタンスのメソッドを実行する関数オブジェクトが参照（取得）できる
    fun greet() {
        println("$name です $age です")
        at18year(::moreYearsAt)
    }

    fun moreYearsAt(year: Int) : Int{
        return year - age
    }
}

fun at18year(action: (Int) -> Int) {
    println("18歳まで ${action(18)} 年です")
}

fun main() {
    val p1 = Person2("ゆみ", 5)
    p1.greet()
}