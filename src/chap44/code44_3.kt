package chap44

fun main() {
    val text = "勉強"
//    val massage = text.getOneTwoFiveMessage()
//    println(massage)
    println(text.oneTwoFiveMessage)
}

//fun String.getOneTwoFiveMessage(): String = "一に$this 二に$this 三、四がなくて五に$this"

val String.oneTwoFiveMessage: String
    get() = "一に$this 二に$this 三、四がなくて五に$this"