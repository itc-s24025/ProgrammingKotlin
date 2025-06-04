package chap37

fun main() {
    val calulator1 = getCalculator("+")
    val calulator2 = getCalculator("-")
    val result1 = calulator1(10.0, 2.0)
    val result2 = calulator2(10.0, 2.0)
    println(result1)
    println(result2)
}

fun getCalculator(type: String): (Double, Double) -> Double {
    val p = fun(x: Double, y: Double) = x + y
    val m = fun(x: Double, y: Double) = x - y

    return when(type) {
        "+" -> p
        else -> m
    }
}