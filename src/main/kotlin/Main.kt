fun main() {
    println(
        Solution().solution(arrayOf("abce", "abcd", "cdx"), 2)
    )
}

class Solution {
    fun solution(strings: Array<String>, n: Int) = strings.sortedWith { s1, s2 ->
        if (s1[n] == s2[n]) {
            if (s1 > s2) 1 else -1
        } else if (s1[n] > s2[n]) {
            1
        } else -1
    }
}