import kotlin.math.abs
import kotlin.math.min

private fun solve() {
    val (n, k) = readln().split(' ').map { it.toInt() }
    val s = readln()
    val map = mutableMapOf<Char, Int>()
    for (c in s) map[c] = (map[c] ?: 0) + 1
    var a = 0
    var b = 0
    for (i in 'A'..'Z')
    {
        a += min(map[i] ?: 0, map[i + 32] ?: 0)
        b += abs((map[i] ?: 0) - (map[i + 32] ?: 0)) / 2
    }
    println(a + min(b, k))
}

fun main() {
    repeat(readln().toInt()) { solve() }
}
