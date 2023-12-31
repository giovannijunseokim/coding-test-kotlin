fun main() {
    Solution().solution(intArrayOf(2, 6, 8, 14))
}

class Solution {
    fun solution(arr: IntArray): Int {
        var answer = arr.max()
        println(answer)
        while (arr.sumOf { answer % it } != 0) {
            answer += arr.max()
        }
        return answer
    }
}