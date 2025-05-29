package selfstudy
//
////Calculator という名前で簡単な電卓クラスを定義してください。
//
////持っているプロパティ
////currentValue: 現在の値 (初期値は 0)
//
////メソッド
////add(number: Int): 現在の値に number を足す
////subtract(number: Int): 現在の値から number を引く
////multiply(number: Int): 現在の値に number を掛ける
////divide(number: Int): 現在の値を number で割る (0 で割る場合は何もしない)
////clear(): 現在の値を 0 にリセットする
////getCurrentValue(): 現在の値を返す
//
////main 関数の中で Calculator クラスのインスタンスを作り、いくつかの計算を実行して結果を表示してみてください。
//
//fun main() {
//    print("1.足し算 2.引き算 3.掛け算 4.割り算: ")
//    val input = readln().toInt()    // 1, 2, 3, 4選択
//    println("半角区切りで計算したい数字を入力してください")
//    val number = readln().split(" ").map { it.toInt() }     // 10 10 とか
//    val calculator = Calculator(number)
//
//    if (input == 1) {
//        for (num in number) {
//            calculator.add(num)
//        }
//        println("${calculator.currentValue}")
//    } else if (input == 2) {
//        for (num in number) {
//            calculator.subtract(num)
//        }
//        println("${calculator.currentValue}")
//    } else if (input == 3) {
//        for (num in number) {
//            calculator.multiply(num)
//        }
//        println("${calculator.currentValue}")
//    } else if (input == 4) {
//        for (num in number) {
//            calculator.divide(num)
//        }
//        println("${calculator.currentValue}")
//    }
//}
//
//class Calculator(number: List<Int>) {
//    val currentValue = 0
//
//    fun add(num: Int){
//        currentValue += num
//    }
//    fun subtract(num: Int){
//        currentValue -= num
//    }
//    fun multiply(num: Int){
//        currentValue *= num
//    }
//    fun divide(num: Int){
//        currentValue /= num
//    }
//}