fun main() {
    println(
        Solution().solution("for the last week")
    )
}

class Solution {
    fun solution(s: String): String = s.split(' ').joinToString(separator = " ") {
        it.mapIndexed { index, c -> if (index == 0) c.uppercase() else c.lowercase() }.joinToString(separator = "")
    }
}