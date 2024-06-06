package practice10

private fun solve() {
    val (a, b) = readln().split(' ').map {
        when (it.last()) {
            'S' -> -it.length
            'L' -> it.length
            else -> 0
        }
    }
    println(
        when (a.compareTo(b)) {
            1 -> '>'
            0 -> '='
            else -> '<'
        }
    )
}

fun main() {
    repeat(readln().toInt()) { solve() }
}
