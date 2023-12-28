fun main() {
    println(
        Solution().solution(99999)
    )
}

class Solution {
    fun solution(n: Int): Int {
        val fiboList = (0..n).toMutableList()
        for (index in 0 until fiboList.size) {
            if (index > 1) fiboList[index] = (fiboList[index - 1] + fiboList[index - 2]).rem(1234567)
        }
        return fiboList.last()
    }
}