import kotlin.math.absoluteValue

fun main() {
    println(Solution().solution(intArrayOf(1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5), "right"))
}

class Solution {
    fun solution(numbers: IntArray, hand: String): String {
        val sb = StringBuilder()
        val keypadMap = mapOf(
            '1' to (0 to 0),
            '2' to (0 to 1),
            '3' to (0 to 2),
            '4' to (1 to 0),
            '5' to (1 to 1),
            '6' to (1 to 2),
            '7' to (2 to 0),
            '8' to (2 to 1),
            '9' to (2 to 2),
            '0' to (3 to 1)
        )
        var leftHandPosition = 3 to 0
        var rightHandPosition = 3 to 2
        for (number in numbers) {
            val numberPosition: Pair<Int, Int> = keypadMap['0' + number]!!
            if (number in 1..7 step 3) {
                sb.append('L')
                leftHandPosition = keypadMap['0' + number]!!
                continue
            }
            if (number in 3..9 step 3) {
                sb.append('R')
                rightHandPosition = numberPosition
                continue
            }

            val leftHandDistance =
                (numberPosition.first - leftHandPosition.first).absoluteValue + (numberPosition.second - leftHandPosition.second).absoluteValue
            val rightHandDistance =
                (numberPosition.first - rightHandPosition.first).absoluteValue + (numberPosition.second - rightHandPosition.second).absoluteValue

            if (leftHandDistance < rightHandDistance) {
                sb.append('L')
                leftHandPosition = numberPosition
            } else if (leftHandDistance > rightHandDistance) {
                sb.append('R')
                rightHandPosition = numberPosition
            } else {
                if (hand == "left") {
                    sb.append('L')
                    leftHandPosition = numberPosition
                }
                if (hand == "right") {
                    sb.append('R')
                    rightHandPosition = numberPosition
                }
            }
        }
        return sb.toString()
    }
}