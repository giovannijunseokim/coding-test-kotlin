fun main() {
    println(
        Solution().solution(
            intArrayOf(4, 7, 12), booleanArrayOf(true, false, true)
        )
    )
}

class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int =
        absolutes.zip(signs.map { if (it) 1 else -1 }).sumOf { it.first * it.second }
}