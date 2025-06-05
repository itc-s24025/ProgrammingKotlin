package chap41

fun main() {
    val box1 = Box<String>()
    val box2 = Box<Int>()
    box1.setValue("文字列ですよ^^;", "あいうえお")
    box2.setValue("整数ですよ(^o^;)", 1000)

    box1.printValues()
    box2.printValues()
}