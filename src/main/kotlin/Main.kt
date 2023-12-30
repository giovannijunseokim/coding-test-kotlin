import kotlin.math.abs

fun main() {
    Solution().solution(8, 3, 7)
}

class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        var round = 1
        var player1 = a - 1
        var player2 = b - 1
        while (!(abs(player1 - player2) == 1 && player1 / 2 == player2 / 2)) {
            player1 /= 2
            player2 /= 2
            round++
        }

        return round
    }
}