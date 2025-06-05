package chap41

class Box2<L, C> {
    var label: L? = null
    var content: C? = null

    fun setValue(lebel: L, content: C) {
        this.label = lebel
        this.content = content
    }

    fun printValues() {
        println("$label : $content")
    }
}