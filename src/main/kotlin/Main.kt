fun main(args: Array<String>) {
    println(Solution().solution("10203", "15"))
}

class Solution {
    fun solution(t: String, p: String): Int {
        return (0..t.length - p.length)
            .map { startIndex -> t.substring(startIndex until startIndex + p.length) }
            .count { substring -> substring <= p }
    }
}