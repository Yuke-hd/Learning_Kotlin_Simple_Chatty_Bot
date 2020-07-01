import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val n = scanner.nextInt()
    val numbers1 = (a..b).toList()
    val tar = numbers1.filter { it % n == 0 }
    print(tar.size)
}