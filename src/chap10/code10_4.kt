package chap10

fun main() {
    val rangeA: LongRange = 0 .. 10000000000L
    val rangeB: CharRange = 'A'..'E'
    val rangeC: CharRange = 'あ'..'お'

    val fragA = 500 in rangeA
    val fragB = 'D' in rangeB
    val fragC = 'え' in rangeC

    println("$fragA $fragB $fragC")

}