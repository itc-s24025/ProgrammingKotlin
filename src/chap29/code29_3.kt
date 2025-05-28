package chap29

fun main() {
    val car1 = Ferrari("赤")
    val car2 = Prius("グレー")
    driveByCar(car1)
    driveByCar(car2)
}

// オーバロード-> 同じ名前で型やパラメータが違う関数
//              型を気にせずに関数を呼び出せる

fun driveByCar(car: Ferrari) {
    println("Ferrari対応のdrivebycarが呼ばれました")
    car.drive(100.0)
}

fun driveByCar(car: Prius) {
    println("Prius対応のdrivebycarが呼ばれました")
    car.drive(100.0)
}
