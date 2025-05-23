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

    val seniorAmount = senior * 1300
    val adultAmount = adult * 2000
    val childAmount = child * 1000

    if (senior >= 10) {
        println(seniorAmount - 200)
    } else if (adult >= 10) {
        println(adultAmount - 200)
    }else if (child >= 10) {
        println(childAmount - 200)
    }

    println(seniorAmount)
    println(adultAmount)
    println(childAmount)

}