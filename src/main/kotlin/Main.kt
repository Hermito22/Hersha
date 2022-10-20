fun main(args: Array<String>) {
    println("Hello World!")
    println("Program arguments: ${args.joinToString()}")

    val result = sum(a = 1, b = 2)
    println("The result is: $result")

    printSum(a = 5 , b = 5)

    println("The sum with parameters taken from the args")
    val argA = args[0].toIntOrNull() ?: 0
    val argB = args[1].toIntOrNull() ?: 0

    printSum(a = argA, b = argB)
}

// A function with two Int parameters and Int return type.
fun sum(a: Int, b: Int): Int {
    return a + b
}

/**
 * A function that returns no meaningful value.
 *
 * NOTE: Unit return type can be omitted.
 **/
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}