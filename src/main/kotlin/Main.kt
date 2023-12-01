fun main() {
    println(
        Solution().solution(intArrayOf(1, 2, 3, 4, 6, 7, 8, 0))
    )
}

class Solution {
    fun solution(numbers: IntArray): Int = (1..9).filterNot { numbers.contains(it) }.sum()
}