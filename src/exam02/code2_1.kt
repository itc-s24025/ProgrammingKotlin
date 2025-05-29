package exam02

import kotlin.random.Random

// Dice という名前でサイコロを表すクラスを定義してください(デフォルトは6面)
// 一般的な6面サイコロ以外も対応したいので、いくつまでの数を出せるか
// コンストラクタでパラメータとして受け取れるようにしてください

// 持っているプロパティ
// - name       => 識別用の名前
// - number     => 今の出目
// - maxNumber  => サイコロの目の最大値

// メソッド
// - roll       => サイコロを振る

fun main() {
    print("何面のサイコロを振る？: ")
    val maxNumber = readln().toInt()
    val dice = Dice(maxNumber)
    dice.roll()
    }

    class Dice(val maxNumber: Int) {
        val name = "${maxNumber}面サイコロ"
        var number = 0

        fun roll() {
            number = Random.nextInt(1,maxNumber + 1)
            println("${maxNumber}面サイコロの出目: ${number}")
        }
    }
