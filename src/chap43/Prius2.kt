package chap43

class Prius2(color: String) : Car2(color) {
    override fun letEngineWork() {
        println("すいーん🚗")
        // public なプロパティの protectedなセッターを呼び出す
        // サブクラスならOK
        fuel -= 0.5
    }

}