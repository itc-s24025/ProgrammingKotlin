package chap43

open class Car2 (val color: String){
    var fuel = 50.0
    protected set

    fun drive() {
        if (fuel > 0.0) {
            letEngineWork()
            println("${color}の車が走りました")
        }else{
            println("ガス欠で走れません")
        }
    }
    // protected サブクラスのみアクセス可能
    protected open fun letEngineWork() {
        println("ブルルーン🚗")
        fuel -= 0.0
    }
}