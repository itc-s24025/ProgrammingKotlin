package chap41

fun main() {
    val box1 = Box2<Int, String>()
    val box2 = Box2<String, Double>()
    box1.setValue(500, "ごひゃく")
    box2.setValue("pi🐣", 3.14)
    box1.printValues()
    box2.printValues()
}