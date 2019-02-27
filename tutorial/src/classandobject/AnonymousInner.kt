package classandobject

fun main(args: Array<String>) {
    // インターフェイスのインスタンス化
    var programmer: Human = object : Human {
        override fun think() {
            print("Anonymous Inner Class")
        }
    }
    programmer.think()
}

interface Human {
    fun think()
}