package practice10

import kotlin.math.min
import kotlin.math.max

private fun solve() {
    val s = readln()
    val a = min(s.first().code, s.last().code)
    val b = max(s.first().code, s.last().code)
    val r = s.indices.filter { s[it].code in a..b }
        .sortedWith(if (s.first().code < s.last().code) compareBy<Int> { s[it] }.thenBy { it } else compareByDescending<Int> { s[it] }.thenBy { it })
    println("${b - a} ${r.size}")
    println(r.map { it + 1 }.joinToString(" "))
}

fun main() {
    repeat(readln().toInt()) { solve() }
}
