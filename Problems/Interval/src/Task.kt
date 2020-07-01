import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val x = scanner.nextLine().toInt()
    if (x > -15 && x <= 12) {
        print("True")
    } else if (x > 14 && x < 17) {
        print("True")
    } else if (x >= 19) {
        print("True")
    } else
        print("False")
}