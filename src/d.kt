import java.util.TreeSet

private fun solve() {
    val (_n, _c) = readln().split(' ')
    val n = _n.toInt()
    val c = _c[0]
    val s = readln()
    if (c == 'g') {
        println('0')
        return
    }
    val g = TreeSet(s.indices.filter { s[it] == 'g' })
    println(s.indices.filter { s[it] == c }.maxOf {
        val upper_bound = g.higher(it)
        if (upper_bound != null) upper_bound - it else n - it + g.first()
    })
}

fun main() {
    repeat(readln().toInt()) { solve() }
}
