import kotlin.math.max
import kotlin.math.min

fun main() {
    Solution().solution(24, 24)
}

class Solution {
    fun solution(brown: Int, yellow: Int): IntArray =
        (1..yellow).filter { yellow % it == 0 }.first { (it + 2) * (yellow / it + 2) == brown + yellow }
            .let { intArrayOf(max(it + 2, yellow / it + 2), min(it + 2, yellow / it + 2)) }
}