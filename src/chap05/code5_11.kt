package chap05

import jdk.internal.joptsimple.internal.Messages.message

fun main() {
    val h: Int = 8
    val message1 = "本日働いた時間は、${h}hours"
    val message2 = "このペースで一ヶ月毎日働くと${h * 30}hoursの労働になります"
    val message3 = "このペースで一年間毎日働くと${h * 365}hoursの労働になります"

    println(message1)
    println(message2)
    println(message3)

}