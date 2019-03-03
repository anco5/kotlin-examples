package introduction

/**
 * Named Argument
 */
fun joinOptions(options: Collection<String>) =
    options.joinToString(prefix = "[", separator = "/", postfix = "]", limit = 3, truncated = "more...")


fun main(args: Array<String>) {
    val collection: MutableList<String> = mutableListOf("1","2","3","4","5")
    print(joinOptions(collection)) // -> [1/2/3/more...]
}

/*
 *
 * [JoinToString]
 * kotlin-stdlib/kotlin.collections/joinToString
 *
 * ■ default
 * separator: CharSequence = ","
 * prefix: CharSequence = ""
 * postfix: CharSequence = ""
 * limit: Int = -1
 * truncated: CharSequence = "..."
 * transform: (T) -> CharSequence = null
 *
 */