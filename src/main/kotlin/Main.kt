fun main() {
    println(
        Solution().solution(3, 20, 4)
    )
}

class Solution {
    fun solution(price: Int, money: Int, count: Int): Long =
        (1..count).sumOf { it * price.toLong() }.let { if (money > it) 0 else it - money }
}