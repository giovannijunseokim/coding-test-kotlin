fun main() {
    println(Solution().solution("abracadabra"))
}

class Solution {
    fun solution(s: String): Int {
        var answer = 0

        var sameCharCount = 0
        var diffCharCount = 0
        var firstChar: Char? = null
        var charIndex = 0

        while (charIndex < s.length) {
            if (firstChar == null) {
                firstChar = s[charIndex]
                sameCharCount++
                charIndex++
            }

            if (charIndex == s.length) {
                answer++
                break
            }

            if (firstChar == s[charIndex]) {
                sameCharCount++
            } else {
                diffCharCount++
            }
            charIndex++

            if (charIndex == s.length) {
                answer++
                break
            }

            if (sameCharCount == diffCharCount) {
                firstChar = null
                sameCharCount = 0
                diffCharCount = 0

                answer++
                continue
            }
        }

        return answer
    }
}