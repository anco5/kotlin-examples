package introduction

/**
 * Default Arguments
 */
fun foo(name: String = "", number: Int = 42, toUpperCase: Boolean = false) =
    (if (toUpperCase) name.toUpperCase() else name) + number

fun useFoo() = listOf(
    foo("a"),
    foo("b", number = 1),
    foo("c", toUpperCase = true),
    foo(name = "d", number = 2, toUpperCase = true)
)

fun main(args: Array<String>) {
    print(useFoo()) // -> [a42, b1, C42, D2]
}

/*
 * 関数パラメータにデフォルト値を定義することが可能.
 * デフォルト値は引数が省略された場合に使用される.
 * これにより引数に対応するようにオーバーロードする必要がなくなる.
 */