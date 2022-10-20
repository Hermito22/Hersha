fun main(args: Array<String>) {
    println("Hello World!")
    println("Program arguments: ${args.joinToString()}")
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