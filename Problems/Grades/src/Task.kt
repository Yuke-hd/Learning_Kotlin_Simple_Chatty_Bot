import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var a = 0; var b = 0; var c = 0; var d = 0
    val n = scanner.nextInt()
    repeat(n) {
        when (scanner.nextInt()) {
            2 -> ++d
            3 -> ++c
            4 -> ++b
            5 -> ++a
        }
    }
    print("$d $c $b $a")
}