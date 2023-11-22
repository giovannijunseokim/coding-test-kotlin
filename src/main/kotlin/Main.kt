import java.util.*

fun main() {
    println(
        Solution().solution(
            arrayOf(
                intArrayOf(0, 0, 0, 0, 0),
                intArrayOf(0, 0, 1, 0, 3),
                intArrayOf(0, 2, 5, 0, 1),
                intArrayOf(4, 2, 4, 4, 2),
                intArrayOf(3, 5, 1, 3, 1)
            ), intArrayOf(1, 5, 3, 5, 1, 2, 1, 4)
        )
    )
}

class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer = 0
        val basket = Stack<Int>()
        moves.forEach { move ->
            for (y in board.indices) {
                if (board[y][move - 1] == 0) continue
                if (basket.takeIf { it.isNotEmpty() }?.peek() == board[y][move - 1]) {
                    basket.pop()
                    answer += 2
                } else basket.push(board[y][move - 1])
                board[y][move - 1] = 0
                break
            }
        }
        return answer
    }
}