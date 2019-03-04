package introduction

/**
 * Lambdas
 */
 fun containsEven(collection: Collection<Int>): Boolean = collection.any{ it % 2 == 0}
// fun containsEven(collection: Collection<Int>): Boolean = collection.any{even: Int -> even % 2 == 0} <- 省略なし
// fun containsEven(collection: Collection<Int>): Boolean = collection.any{even -> even % 2 == 0} <- 型省略

fun main(args: Array<String>) {
    val collection = listOf(1,2,3,4,5)
    print(containsEven(collection)) // -> true
}

/*
 * [any関数]
 * <http://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/any.html>
 *
 * > any
 * > 配列内に１つ以上条件と一致する要素がある場合はTrueを返す
 *
 */