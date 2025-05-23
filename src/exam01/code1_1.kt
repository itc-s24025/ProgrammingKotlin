package exam01

/*
キーボードから数字を入力して、1から入力された数までの
FizzBuzz を出力します

FizzBuzz とは　
3の倍数のときにFizz
5の倍数のときにBuzz
3と5の倍数のときにFizzBuzz
それ以外のときはその数字をそのまま出力する

 */
fun main() {
    print("数字を入力してください: ")
    val num = readln().toInt()

    (1..num).forEach {
    val result = if (it % 3 == 0 && it % 5 == 0) {
            "FizzBuzz"
        } else if (it % 3 == 0) {
            "Fizz"
        } else if (it % 5 == 0) {
            "Buzz"
        } else {
            it.toString()
        }
        println(result)
    }
}