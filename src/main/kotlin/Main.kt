fun main() {
    Solution().also { println(it.solution("aukks", "wbqd", 5)) }
}

class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        var answer: String = ""
        val skippableAlphabets = skip.map { it }
        val unskippableAlphabets = ('a'..'z').filter { it !in skippableAlphabets }

        s.forEach { char ->
            val alphabetIndex = (unskippableAlphabets.indexOf(char) + index) % unskippableAlphabets.size
            answer += unskippableAlphabets[alphabetIndex]
        }
        return answer
    }
}