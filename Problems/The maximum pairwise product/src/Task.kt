import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextLine().toInt()
    val array = scanner.nextLine().split(" ").map(String::toInt).sorted()
    println(if (array.size == 1) array[0] else array[n - 2] * array[n - 1])
}
