import java.time.LocalDate

fun main() {
    println(
        Solution().solution(5, 24)
    )
}

class Solution {
    fun solution(a: Int, b: Int): String = LocalDate.of(2016, a, b).dayOfWeek.toString().substring(0..2)
}