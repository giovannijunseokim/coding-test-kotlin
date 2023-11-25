fun main() {
    println(Solution().solution(45))
}

class Solution {
    fun solution(n: Int): Int = n.toString(3).reversed().toInt(3)
}