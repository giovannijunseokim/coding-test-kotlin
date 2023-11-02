fun main() {
    println(Solution().solution("abracadabra"))
}

class Solution {
    fun solution(s: String): Int {
        var answer = 0

        val stack = mutableListOf<Char>()
        s.forEach { char ->
            if (stack.isEmpty()) {
                stack.add(char)
                answer++
            } else if (stack.first() == char) {
                stack.add(char)
            } else {
                stack.removeFirst()
            }
        }
        return answer
    }
}