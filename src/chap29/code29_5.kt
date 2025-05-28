package chap29

fun main() {
    val car1 = Ferrari("赤")
    val car2 = Prius("グレー")
    driveByCar2(car1)
    driveByCar2(car2)
}

// もとのCarクラスを定義(driveは車全部にある機能なのでおかしくない)
// FerrariもPriusも受け取れる

fun driveByCar2(car: Car) {
    car.drive(100.0)
}

