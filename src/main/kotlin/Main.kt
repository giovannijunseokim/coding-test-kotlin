fun main() {
    println(
        Solution().solution("-1 -2 -3 -4")
    )
}

class Solution {
    fun solution(s: String): String = s.split(' ').sortedBy { it.toInt() }.let { "${it.first()} ${it.last()}" }
}