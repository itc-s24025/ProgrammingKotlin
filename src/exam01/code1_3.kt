package exam01

import java.time.chrono.JapaneseEra.values
import kotlin.random.Random

/*
お釣りの金種計算
ランダムで100〜9000の数値を生成します
支払う金額をキーボードから入力します
お釣りを計算して、金種ごとにその枚数を出力してください
トータルの枚数は最小となる組み合わせでお釣りを返します
支払う金額が足りない場合は 足りません と出力してください
 */

fun main() {
    val randAmount = Random.nextInt(100, 9000)
    println("購入金額: ￥${randAmount}")

    print("いくら出す？: ￥")
    val amount = readln().toInt()

    var changeAmount = amount - randAmount

    val calculation = mapOf(
        10000 to "100,000円",
        5000 to "5,000円",
        1000 to "1,000円",
        500 to "500円",
        100 to "100円",
        50 to "50円",
        10 to "10円",
        5 to "5円",
        1 to "1円",
    )
    for ((key, value) in calculation) {
        val cash = changeAmount / key
        changeAmount -= cash * key
        println("$value = $cash")
    }
}