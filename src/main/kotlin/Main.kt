fun main() {
    println(
        Solution().solution(
            arrayOf(intArrayOf(60, 50), intArrayOf(30, 70), intArrayOf(60, 30), intArrayOf(80, 40))
        )
    )
}

class Solution {
    fun solution(sizes: Array<IntArray>): Int = sizes.maxOf { it.maxOf { it } } * sizes.maxOf { it.minOf { it } }
}