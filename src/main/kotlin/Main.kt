import kotlin.math.max
import kotlin.math.min

fun main() {
    Solution().solution(24, 24)
}

class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        for (i in 1..yellow) {
            if (yellow % i == 0 && (i + 2) * (yellow / i + 2) == brown + yellow) {
                return intArrayOf(max((i + 2), (yellow / i + 2)), min((i + 2), (yellow / i + 2)))
            }
        }
        throw Exception()
    }
}