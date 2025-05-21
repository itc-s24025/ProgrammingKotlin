package chap22

fun main() {
    val text = readln()
    try {
        val numbers = text.toInt()
        println("numbers = $numbers")
    }catch (e: NumberFormatException){
        println("$text という文字は数値に変換できません")
    }
}