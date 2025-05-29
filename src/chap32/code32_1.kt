package chap32

fun main() {
    var text: String? = "あいうえお"
    text = null
    println("文字列${text}の長さ = ${text?.length}")
    // 32.5
    var text_a: String = "あいうえお"
    var text_b: String? = "あいうえお"
    var length_a = countTextLength1(text_a)
    var length_b = countTextLength1(text_b!!)
//    var length_c = countTextLength1(null)

}

fun countTextLength1(text: String): Int {
    return text.length
}

fun countTextLength2(text: String?): Int {
    return text?.length ?: 0
}