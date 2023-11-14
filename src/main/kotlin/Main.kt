fun main() {
    Solution().also {
        println(it.solution(5))
    }
}

class Solution {
    fun solution(n: Int): Int {
        return (2..n).first { n % it == 1 }
    }
}