import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextLine().toInt()
    val array = mutableListOf<Int>()
    var a = Int.MIN_VALUE
    var b: Int
    var count = 0
    repeat(n) {
        b = scanner.nextInt()
        if (a > b) {
            array.add(count)
            count = 0
        }
        ++count
        a = b
    }
    array.add(count)
    print(array.max())
}
