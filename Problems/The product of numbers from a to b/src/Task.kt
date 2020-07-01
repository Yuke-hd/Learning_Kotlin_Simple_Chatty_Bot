import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val (a,b) = scanner.nextLine().split(" ").map(String::toInt)
    var product = 1L
    for(x in a until b){
        product *= x
    }
    print(product)
}