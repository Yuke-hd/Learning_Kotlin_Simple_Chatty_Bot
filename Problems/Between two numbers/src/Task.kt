import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val array = scanner.nextLine().split(" ")
    println(array[0] in array[1]..array[2])
}