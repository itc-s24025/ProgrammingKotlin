package chap07

fun main() {
    val delicious = false
    val cheap = false
    println("このレストランは美味しい: $delicious")
    println("このレストランは安い: $cheap")
    val lets_eat = delicious && cheap
    println("食事する?: $lets_eat")
    // && はtrue && trueになるとtrueを出す
    // false && falseではtrueにはならない
}
