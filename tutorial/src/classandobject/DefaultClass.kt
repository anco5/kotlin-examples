package classandobject

class DefaultClass {
    // プロパティ（フィールド）
    private var name: String = "Anco"

    fun printMe() {
        print("My name is " + name)
    }
}

fun main(args: Array<String>) {
    // インスタンス生成
    val obj = DefaultClass()
    obj.printMe()
}