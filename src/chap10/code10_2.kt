package chap10

fun main() {
    val age: Int = 10

    val range1: IntRange = 0 .. 6
    val range2: IntRange = 7 .. 12
    val range3: IntRange = 13 .. 15

    // inをつけることでrangeの中に特定の数字が含まれているか確認
    val flag1 = age in range1   // 0 .. 6
    val flag2 = age in range2   // 7 .. 12
    val flag3 = age in range3   // 13 .. 15

    println("${age}際の子供は就学前 ${flag1}")  // false
    println("${age}際の子供は小学生 ${flag2}")  // true
    println("${age}際の子供は中学生 ${flag3}")  // false
}