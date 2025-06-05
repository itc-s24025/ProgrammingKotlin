package chap41

class Box<T> {
    var label: String = ""
    var content: T? = null

    fun setValue(lebel: String, content: T) {
        this.label = lebel
        this.content = content
    }

    fun printValues() {
        println("$label : $content")
    }
}