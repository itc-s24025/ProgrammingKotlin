package selfstudy

fun main() {
    // 変更可能な変数定義 var
//    var a = 1
//    println(a)

    // 変更不可な変数定義 val
//    val b = 2
//    println(b)

    // 真偽値
//    var c = true
//    println(c)

    // 文字列の中に変数やプログラムを記述
//    println("$a + $b = $c")

    // 生文字列
//    println("""a \n a""")

    // 配列 参照型なのでcontentToString()が必要
//    var nums = arrayOf(1,2,3,4,5)
//    println(nums.contentToString())
//    // 一文字づつ改行
//    for (n in nums) { println(n) }
//    // 偶数のみというフィルタをかける
//    println(nums.filter { it % 2 == 0 })

    // セット 重複を許可しない
//    var d = mutableSetOf("red", "red", "blue")
//    println(a)

    // マップ キーバリューを扱う
//    var e = mapOf("a" to 1, "b" to 2)
//    println(e["a"])

    // range kotlinでは..と表記することもできる
    // 以下二つは同じ意味
//    for (i in 1.rangeTo(10)) println(i)
//    for (i in 1..10) println(i)
    // !inで範囲外のときの動きを指定
//    var f = 50
//    if (f !in 1..10) println("Out of range")
    // 10から1までの範囲内で2個ずつ減少
//    for (i in 10 downTo 1 step 2) println(i)
    // bがaからzの範囲内だったらOKと表示
//    if ('b' in 'a'..'z') println("OK")






}


