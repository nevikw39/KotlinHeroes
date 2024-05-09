private fun solve() {
    val n = readln().toInt()
    val a = readln().split(' ').map { it.toInt() }
    val x = if (a[0] == a[1]) a[0] else a[2]
    println(a.indexOfFirst { it != x } + 1)
}

fun main() {
    repeat(readln().toInt()) { solve() }
}
