package selfstudy

abstract class Animal {
    abstract fun makeSound() // 抽象メソッド

    fun eat() {
        println("もぐもぐ食べる")
    }
}

class Dog : Animal() {
    override fun makeSound() {
        println("ワンワン！")
    }
}

class Cat : Animal() {
    override fun makeSound() {
        println("ニャーニャー")
    }
}

fun main() {
    val dog = Dog()
    val cat = Cat()

    dog.eat()
    dog.makeSound()
    cat.eat()
    cat.makeSound()
}