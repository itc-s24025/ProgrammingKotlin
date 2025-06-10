package jp.ac.it_college.std.s24025.example.cars

open class Car(val color: String) {
    open fun drive() {
        println("${color}の車が走っています")
    }
}