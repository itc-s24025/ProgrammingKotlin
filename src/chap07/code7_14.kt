package chap07
import kotlin.random.Random

fun main() {
    val a = Random.nextInt(0, 100)
    // a が 0~59 なら D
    // a が 60~69 なら C
    // a が 70~79 なら B
    // a が 80~89 なら A
    // a が 90~ なら S

    // a の値とともに出力してください
//    println(a)
//    if (0 <= a && a <= 59) {
//        println("D")
//    }else if (60 <= a && a <= 69) {
//        println("C")
//    }else if (70 <= a && a <= 79) {
//        println("B")
//    }else if (80 <= a && a <= 89) {
//        println("A")
//    }else{
//        println("S")
//    }

    println(a)
    if (a < 60){
        println("D")
    }else if (a < 70){
        println("C")
    }else if (a < 80){
        println("B")
    }else if (a < 90){
        println("A")
    }else{
        println("S")
    }

}