fun main() {
    println(
        Solution().solution(3, 20, 4)
    )
}

class Solution {
    fun solution(price: Int, money: Int, count: Int): Long =
        (((1..count).sumOf { price.toLong() * it } - money).takeIf { it > 0L } ?: 0)
}