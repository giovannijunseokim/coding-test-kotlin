fun main() {
    println(
        Solution().solution(
            intArrayOf(44, 1, 0, 0, 31, 25), intArrayOf(31, 10, 45, 1, 6, 19)
        )
    )
}

class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        val answer: MutableList<Int> = mutableListOf()
        win_nums.map { lottos.contains(it) }.count { it }.also { answer += it + lottos.count { it == 0 } }
            .let { answer += it }
        return answer.map { if (it >= 2) 7 - it else 6 }.toIntArray()
    }
}