fun main() {
    println(
        Solution().solution(arrayOf("abce", "abcd", "cdx"), 2)
    )
}

class Solution {
    fun solution(strings: Array<String>, n: Int) = strings.sorted().sortedBy { it[n] }
}