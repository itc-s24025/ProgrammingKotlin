package chap41

class Box3<L, C>(val label:L? = null, val content:C? = null) {

}

fun main() {
    val box1 = Box3("ラベル", 123)
}