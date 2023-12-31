fun main() {
    Solution().solution(intArrayOf(2, 6, 8, 14))
}

class Solution {
    fun solution(arr: IntArray): Int {
        var answer = arr.first()
        arr.forEach {
            if (answer < it) answer = it
        }
        while (arr.sumOf { answer % it } != 0) {
            var max = arr.first()
            arr.forEach {
                if (max < it) max = it
            }
            answer += max
        }
        return answer
    }
}