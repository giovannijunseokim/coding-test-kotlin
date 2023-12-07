fun main() {
    println(
        Solution().solution(intArrayOf(1, 2, 3, 4))
    )
}

class Solution {
    fun solution(nums: IntArray): Int {
        var answer = 0

        for (first in 0 until nums.size - 2) for (second in first + 1 until nums.size - 1) for (third in second + 1 until nums.size) {
            (nums[first] + nums[second] + nums[third]).let { num ->
                if ((1..num).filter { num % it == 0 }.size == 2) {
                    answer++
                }
            }
        }

        return answer
    }
}