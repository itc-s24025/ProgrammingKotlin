package chap28

class Prius(color: String) : Car(color) {
    override fun drive(d: Double) {
        distance += d
        println("${color}のプリウスが走っています！スィーン！")
        println("すごい静かですね")
        println("マイレージは${distance}kmです")
        println("トヨタの車はいっぱい走ってもなかなか故障しません")
    }
}