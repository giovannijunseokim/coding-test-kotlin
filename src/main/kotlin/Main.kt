fun main() {
    println(
        Solution().solution("110010101001")
    )
}

class Solution {
    fun solution(s: String): IntArray {
        var string = s
        var count1 = 0
        var round = 0
        while (string != "1") {
            string.forEach { if (it == '0') count1++ }
            string = string.filterNot { it == '0' }.length.toString(2)
            round++
        }
        return intArrayOf(round, count1)
    }
}