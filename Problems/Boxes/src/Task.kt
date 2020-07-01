import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val (x1, x2, x3) = scanner.nextLine().split(" ").map { it.toInt() }
    val (y1, y2, y3) = scanner.nextLine().split(" ").map { it.toInt() }
    val x: IntArray = intArrayOf(x1, x2, x3)
    val y: IntArray = intArrayOf(y1, y2, y3)

    x.sort()
    y.sort()

    if (x[0] * x[1] * x[2] == y[0] * y[1] * y[2]) {
        print("Box 1 = Box 2"); return
    }

    val xy = compareDim(x, y)
    val yx = compareDim(y, x)
    if (xy || yx) {
        if (xy) {
            print("Box 1 > Box 2"); return
        }
        if (yx) {
            print("Box 1 < Box 2"); return
        }
    }

    print("Incomparable")
}

fun compareDim(box1: IntArray, box2: IntArray): Boolean {
    return box1[0] - box2[0] >= 0 && box1[1] - box2[1] >= 0 && box1[2] - box2[2] >= 0
}
