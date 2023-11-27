fun main() {
    println(Solution().solution(intArrayOf(1, 2, 3, 4), intArrayOf(-3, -1, 0, 2)))
}

class Solution {
    fun solution(aList: IntArray, bList: IntArray): Int {
        return aList.mapIndexed { index, a ->
            a * bList[index]
        }.sum()
    }
}