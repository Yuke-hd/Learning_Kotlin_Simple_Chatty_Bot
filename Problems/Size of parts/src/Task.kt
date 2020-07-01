import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var large = 0;
    var small = 0;
    var perfect = 0
    val n = scanner.nextInt()
    repeat(n) {
        when (scanner.nextInt()) {
            1 -> ++large
            -1 -> ++small
            0 -> ++perfect
        }
    }
    print("$perfect $large $small")
}