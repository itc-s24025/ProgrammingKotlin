package chap43

class Prius(color: String) : Car(color) {
    override fun letEngineWork() {
        println("すいーん🚗")
        fuel -= 0.5
    }

}