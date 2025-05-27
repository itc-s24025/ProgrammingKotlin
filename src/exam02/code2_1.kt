package exam02

import kotlin.math.round
import kotlin.random.Random

//// Dice という名前でサイコロを表すクラスを定義してください(デフォルトは6面)
//// 一般的な6面サイコロ以外も対応したいので、いくつまでの数を出せるか
//// コンストラクタでパラメータとして受け取れるようにしてください
//
//// 持っているプロパティ
//// - name       => 識別用の名前
//// - number     => 今の出目
//// - maxNumber  => サイコロの目の最大値
//
//// メソッド
//// - roll       => サイコロを振る
//
//fun main() {
//
//    println("1: 6面のサイコロを降る  2: 指定した面のサイコロを降る")
//    val input = readln().toInt()
//    val dice = Dice(name = "1", 0, 6)
//
//
//    if (input == 1) {
//        dice.roll()
//    }else if (input == 2) {
//        print("サイコロの面を指定してください: ")
//        var maxNumber = readln().toInt()
//        dice.roll()
//    }
//}
//
//class Dice(var name: String, var number: Int, ver maxNumber: Int) {
//    fun roll() {
//        println("サイコロの目: " + Random.nextInt(1, until = maxNumber))
//    }
//}