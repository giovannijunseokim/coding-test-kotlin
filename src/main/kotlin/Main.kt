fun main() {
    println(
        Solution().solution(
            intArrayOf(4, 7, 12), booleanArrayOf(true, false, true)
        )
    )
}

class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int =
        absolutes.foldIndexed(0) { index, acc, num -> acc + if (signs[index]) num else -num }
}