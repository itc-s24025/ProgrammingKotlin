package chap04

import java.rmi.server.UID

fun main() {
    val a: Byte = 100
    val b: Short = 10000
    val c: Int = 1000000000
    val d: Long = 1000000000000000000L  // Lと書くことでLongだと判断 書かなかったらIntに判定されエラーに
    val e: Float = 0.123f               // fと書くことでFloatだと判断 書かなかったらIntに判定されエラーに
    val f: Double = 0.123456789
    val g: UByte = 200u
    val h: UShort = 40000u
    val i: UInt = 3000000000u
    val j: ULong = 10000000000000000000u    // リテラルの値がIntサイズだったらIntに　LongサイズだったらLongになる

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(g)
    println(h)
    println(i)
    println(j)
    println(j)
}