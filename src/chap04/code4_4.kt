package chap04

fun main() {
    val a = 10_000_000          // 大きい数を見やすくできる
    val b: Byte = 0x7f          // 16進数(2桁なら _ 区切りができる)
    val c: Byte = 0b0010_1000   // 2進数(4桁なら _ 区切りができる)

    println(a)
    println(b)
    println(c)

    val f = 149_600_000.123f
    val d = 149_600_000.123

    println(f)
    println(d)
}