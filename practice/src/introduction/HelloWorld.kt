package introduction

/**
 * Simple Function
 */
class HelloWorld {
    fun TODO(): String {
        return "OK"
    }

    fun start(): String = helloWorld.TODO()
}

val helloWorld: HelloWorld = HelloWorld()

fun main(args: Array<String>) {
    print(helloWorld.start())
}