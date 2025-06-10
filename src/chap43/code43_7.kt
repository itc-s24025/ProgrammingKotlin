package chap43

fun main() {
    val car = Car2("白")
    car.drive()
    car.drive()
    println("燃料の残り: ${car.fuel}")
    // public なプロパティの protected なセッターは外から呼び出せない
//    car.fuel = 70.0
    println("燃料の残り: ${car.fuel}")

    val prius = Prius2("黒")
    prius.drive()
    prius.drive()
    println("燃料の残り: ${prius.fuel}")
}