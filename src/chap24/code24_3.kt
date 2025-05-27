package chap24


fun main() {
    val p = Person()
    p.age = 30
    p.age = 25
    p.age = 80
    p.age = 10

    p.name = "たけし"
    println(p.message)
}

class Person {
//    value は、新しく代入されようとしている値のこと
//    field は、そのプロパティが実際に持っている現在の値を裏側で保持しているもの
    var name: String = ""
    var age: Int = 20
        set(value) {
            print("${field}歳から${value}歳になりました ")
            if (value < field) {
                println("->なんと！若返りましたよ!")
            }else if (value > field) {
                println("->ああ、年を取るのは嫌だなあ")
            }
            // age プロパティの値を新しい value で更新
            field = value
        }

    val message: String
    get() {
        return "${name}です。${age}歳です。"
    }
}