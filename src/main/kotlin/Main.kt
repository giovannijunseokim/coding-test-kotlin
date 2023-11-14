fun main() {
    Solution().also {
        println(
            it.solution(
                5
            )
        )
    }
}

class Solution {
    fun solution(n: Int): Int {
        for (index in 2 until n) {
            if (n % index == 1) return index
        }
        throw Exception()
    }
}