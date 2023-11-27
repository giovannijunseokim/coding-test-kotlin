fun main() {
    println(Solution().solution(intArrayOf(1, 2, 3, 4), intArrayOf(-3, -1, 0, 2)))
}

class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        return a.zip(b).sumOf { it.first * it.second }
    }
}