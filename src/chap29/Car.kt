package chap29

open class Car(val color: String) {
    var distance = 0.0
    open fun drive(d: Double) {
        this.distance += d
        println("${color}の車が${d}km走りました")
        println("その結果マイレージは${distance}kmになりました")

    }
}