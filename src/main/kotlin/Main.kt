fun main() {
    println(
        Solution().solution(
            arrayOf(intArrayOf(60, 50), intArrayOf(30, 70), intArrayOf(60, 30), intArrayOf(80, 40))
        )
    )
}

class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        val sortedSizes = sizes.map { it.sortedDescending() }
        val maxX = sortedSizes.maxOf { it[0] }
        val maxY = sortedSizes.maxOf { it[1] }
        return maxX * maxY
    }
}