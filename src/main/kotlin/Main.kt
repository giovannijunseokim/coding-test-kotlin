fun main() {
    Solution().also { println(it.solution("aukks", "wbqd", 5)) }
    // z code : 122
}

class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        val answer: String = s.map { char ->
            var repeatCount = index
            var newChar = char
            while (repeatCount > 0) {
                if (newChar == 'z')
                    newChar = 'a'
                else newChar += 1

                if (!skip.contains(newChar))
                    repeatCount--
            }
            newChar
        }.joinToString(separator = "")
        return answer
    }
}