package introduction

/**
 * Strings
 */
val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun getPattern(): String = """\d{2} $month \d{4}"""

val hello = "hello"
val world = " world"

fun main(args: Array<String>) {
    println("11 JAN 2019".matches(getPattern().toRegex()))  // -> true
    println("$hello,$world") // -> hello,world
}

/*
 * テンプレートを使用して文字列の結合や正規表現などが表現可能.
 */