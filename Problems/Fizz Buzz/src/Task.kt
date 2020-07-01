import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val start = scanner.nextInt()
    val end = scanner.nextInt()
    for (i in start..end) {
        val mod3 = i % 3 == 0
        val mod5 = i % 5 == 0
        if (!(mod3 || mod5)) {
            println(i); continue
        }
        if (mod3 && mod5) {
            println("FizzBuzz"); continue
        }
        if (mod3) printFizz()
        if (mod5) printBuzz()
    }
}

fun printFizz() {
    println("Fizz")
}

fun printBuzz() {
    println("Buzz")
}
