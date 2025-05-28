package chap27

open class Car(val color: String) {
    var distance = 0.0
    open fun drive(d: Double) {
        distance += d
        println("${color}の車が${d}km走りました")
        println("その結果マイレージは${distance}kmになりました")
    }
}


//fun main() {
//    val car = Car()
//    car.drive(5.0)
//    car.drive(10.0)
//}
