fun main() {
    println(Solution().solution(5, intArrayOf(1, 1, 1, 2, 3, 4)).toList())
}

class Solution {
    fun solution(N: Int, stages: IntArray): IntArray = (1..N).map { stage ->
        stages.filter { it == stage }.size.toDouble()
            .div(stages.filter { it >= stage }.size.toDouble().takeUnless { it == 0.0 } ?: 1.0)
    }.withIndex().sortedByDescending {
        it.value
    }.map { it.index + 1 }.toIntArray()

}