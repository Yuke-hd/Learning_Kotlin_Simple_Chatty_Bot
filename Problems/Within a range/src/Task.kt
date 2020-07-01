import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val (a, b, c, d, e) = scanner.nextLine().split(" ").map { it.toInt() }
    print(e in a..b || e in c..d)
}