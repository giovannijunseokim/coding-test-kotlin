fun main() {
    println(
        Solution().solution(
            intArrayOf(44, 1, 0, 0, 31, 25), intArrayOf(31, 10, 45, 1, 6, 19)
        )
    )
}

class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        return intArrayOf(
            lottos.filter { win_nums.contains(it) || it == 0 }.size,
            lottos.filter { win_nums.contains(it) }.size
        ).map { if (it >= 2) 7 - it else 6 }.toIntArray()
    }
}