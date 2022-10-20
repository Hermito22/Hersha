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

    /**
     * Read-only local variables are defined using the keyword val. They can be assigned a value only once.
     */
    val a: Int = 1  // immediate assignment
    val b = 2   // `Int` type is inferred
    val c: Int  // Type required when no initializer is provided
    c = 3       // deferred assignment

    /**
     * Variables that can be reassigned use the var keyword.
     */
    var x = 5 // `Int` type is inferred
    x += 1
}

// You can declare variables at the top level.
val PI = 3.14
var _x = 0

/**
 * A function with two Int parameters and Int return type.
 */
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

fun incrementX() {
    _x += 1
}