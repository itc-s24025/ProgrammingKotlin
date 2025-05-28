package exam01

/*
映画館の料金を計算するプログラム
シニア→一般→子供 の順で人数を入力して
シニア: 1,300円　一般: 2,000円　子供: 1,000円
ただし10名以上の場合は各200円割引
 */
fun main() {
    print("シニアの人数: ")
    val senior = readln().toInt()
    print("一般の人数: ")
    val adult = readln().toInt()
    print("子供の人数: ")
    val child = readln().toInt()

    val seniorPrice = 1300
    val adultPrice = 2000
    val childPrice = 1000

    var seniorTotalPrice = senior * seniorPrice
    var adultTotalPrice = adult * adultPrice
    var childTotalPrice = child * childPrice

    if (senior >= 10) {
        seniorTotalPrice -= senior * 200
    }
    if (adult >= 10) {
        adultTotalPrice -= adult * 200
        }
    if (child >= 10) {
        childTotalPrice -= child * 200
    }

    val totalAmount = seniorTotalPrice + adultTotalPrice + childTotalPrice
    println("合計金額: ${totalAmount}円")
}


