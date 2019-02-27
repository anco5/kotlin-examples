package classandobject

fun main(args: Array<String>) {
    // インナークラスの呼び出し
    val demo = Piyo().Inner().foo()
    print(demo)
}

class Piyo {
    private val message: String = "piyofoo"
    inner class Inner {
        fun foo() = message
    }
}