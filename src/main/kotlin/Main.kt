fun main() {
    println(
        Solution().solution(
            "12321", "42531"
        )
    )
}

class Solution {
    fun solution(X: String, Y: String): String {
        val sb = StringBuilder()
        var xIndex = 0
        var yIndex = 0

        val x = X.toList().sortedDescending()
        val y = Y.toList().sortedDescending()

        while (xIndex < X.length && yIndex < Y.length) {
            if (x[xIndex] == y[yIndex]) {
                sb.append(x[xIndex])
                xIndex++
                yIndex++
            } else if (x[xIndex] > y[yIndex]) xIndex++
            else yIndex++
        }
        val answer = sb.toString()
        if (answer.isBlank()) return "-1"
        if (answer.first() == '0') return "0"
        return answer
    }
}