// Basic Type
fun main(args: Array<String>) {
    /**
     * Number
     */
    val a: Int = 10000
    val d: Double = 100.00
    val f: Float = 100.00f
    val l: Long = 1000000004
    val s: Short = 10
    val b: Byte = 1

    println("Your Int Value is " + a)
    println("Your Double Value is " + d)
    println("Your Float Value is " + f)
    println("Your Long Value is " + l)
    println("Your Short Value is " + s)
    println("Your Byte Value is " + b)

    /**
     * Char
     */
    val letter: Char
    letter = 'A'
    println("$letter") // ← オフィシャルの書き方 println(letter)でも結果は同じ


    /**
     * Boolean
     */
    val isLetter: Boolean
    isLetter = true
    println("Your character value is " + "$isLetter") // ← オフィシャルの書き方 println(isLetter)でも結果は同じ

    // Strings
    var rawString: String = "I am Raw String!"
    val escapeString: String = "I am escape String!\n"

    println("Hello!" + "$escapeString")
    println("Hey!" + rawString)

    // Arrays
    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5)
    println("I am array Example" + numbers[2])

    /**
     * Collection
     * 可変と不変の２種類
     * 不変：List, Map, Set
     * 可変：MutableList, MutableMap, MutableSet
     */
    val nums: MutableList<Int> = mutableListOf(1, 2, 3)
    val readOnlyView: List<Int> = nums
    println("my mutable list--" + nums)
    nums.add(4)
    println("my mutable list after addition --" + nums)
    println(readOnlyView)
    nums.clear()
    println("my mutable list clear" + nums)

    // first(), last(), filter()
    val items = listOf(1, 2, 3, 4)
    val mutableItems : MutableList<Int> = mutableListOf(1, 2, 3, 4)
    println("First Element of our list----" + items.first())
    println("First Element of mutable list----" + mutableItems.first())
    println("Last Element of our list----" + items.last())
    println("Last Element of mutable list----" + mutableItems.last())
    println("Even Numbers of our list----" + items.filter { it % 2 == 0 })

    val reatWriteMap = hashMapOf("foo" to 1, "bar" to 2)
    println(reatWriteMap["foo"])

    val strings = hashSetOf("a", "b", "c", "c")
    println("My Set Vlaues are " + strings)

    /**
     * Ranges
     */
    val i:Int = 2
    for (j in 1..4)
        print(j)

    if (i in 1..10) { // equivalent of 1 <= i && i <= 10
        print("we found your number --" + i)
    }
}
