fun main(args: Array<String>) {
    /**
     * IF - Else
     */
    val a: Int = 5
    val b: Int = 2
    var max: Int
    if (a > b) {
        max = a
    } else {
        max = b
    }
    println("Maximum of a or b is " + max)

    // 下記と同等
    // val max = if (a > b) a else b

    /**
     * When
     */
    val x: Int = 5
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            println("x is neither 1 or 2")
        }
    }

    // [,]で複数チェックすることも可
    val y: Int = 2
    when (y) {
        1,2 -> println("Value of y either 1,2")
        else -> {
            println("y is neither 1 nor 2")
        }
    }

    /**
     * For Loop
     */
    val items = listOf(1, 2, 3, 4)
    for (i in items) println("Values of the array" + i)

    // ライブラリ関数の使用
    val items_ = listOf(1, 22, 83, 4)
    for ((index, value) in items_.withIndex()) {
        println("The element at $index is $value")
    }

    /**
     * While Loop and Do-While Loop
     */
    // while loop
    var num:Int = 0
    println("Example of while Loop--")

    while(num < 10) {
        print(num)
        num++
    }

    // do-while loop
    var z: Int = 0
    do {
        z = z + 10
        println("I am inside Do block --- " + z)
    } while (z <= 50)

    /**
     * Return
     */
    var n: Int = 10
    println("The value of N is-- " + doubleMe(n))

    /**
     * Continue & Break
     */
    println("Example of Break and Continue")
    myLabel@ for (cb in 1..10) {
        if (cb == 5) {
            println("I am inside if block with value" + cb + "\n-- hence it will the operation")
            break@myLabel
        } else {
            println("I am inside else block with value" + cb)
            continue@myLabel
        }
    }
}

/* Return */
fun doubleMe(n:Int): Int {
    return 2 * n
}