fun main() {
    println(Solution().solution(3, 1, 20))
}

class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer = 0
        var emptyCokes = n

        while (emptyCokes >= a) {
            val newCokes = emptyCokes / a * b
            answer += newCokes
            emptyCokes = newCokes + emptyCokes % a
        }

        return answer
    }
}