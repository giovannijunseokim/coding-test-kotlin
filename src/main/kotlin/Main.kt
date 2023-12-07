fun main() {
    println(
        Solution().solution(
            intArrayOf(1, 5, 2, 6, 3, 7, 4), arrayOf(intArrayOf(2, 5, 3), intArrayOf(4, 4, 1), intArrayOf(1, 7, 3))
        )
    )
}

class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray =
        commands.map { array.toList().subList(it[0] - 1, it[1]).sorted()[it[2] - 1] }.toIntArray()
}