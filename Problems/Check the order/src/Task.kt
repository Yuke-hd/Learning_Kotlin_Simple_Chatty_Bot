import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextLine().toInt()
    var a = Int.MIN_VALUE
    for (x in 1..n) {
        val b = scanner.nextInt()
        if (a > b) {
            println("NO")
            return
        }
        a = b
    }
    println("YES")
}