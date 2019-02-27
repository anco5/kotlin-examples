package classandobject

fun main(args: Array<String>) {
    // ネストクラスのメソッド呼び出し
    val demo = Outer.Nested().foo()
    print(demo)
}

class Outer {
    class Nested {
        fun foo() = "Welcome to The Anco"
    }
}