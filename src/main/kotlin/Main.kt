fun main() {
    println(
        Solution().solution(13, 17)
    )
}

class Solution {
    fun solution(left: Int, right: Int): Int = (left..right).sumOf { if (it.measureCount % 2 == 0) it else -it }

    private val Int.measureCount
        get() = run {
            var count = 0
            for (i in 1..this) if (this % i == 0) count++
            count
        }
}