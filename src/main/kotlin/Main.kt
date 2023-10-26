fun main(args: Array<String>) {
    println(Solution().solution("10203", "15"))
}

class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        for (index in 0..t.length - p.length) {
            if (t.substring(index, index + p.length).toLong() <= p.toLong())
                answer++
        }

        return answer
    }
}