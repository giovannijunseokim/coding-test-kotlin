import kotlin.math.sqrt

fun main() {
    println(Solution().solution(10, 3, 2))
}

class Solution {
    fun solution(number: Int, limit: Int, limitPower: Int): Int {

        var answer: Int = 0
        // 모든 기사 반복
        for (knight in 1..number) {
            val factors = calculateFactors(knight)
            answer += if (factors > limit) limitPower else factors
        }
        return answer
    }

    private fun calculateFactors(number: Int): Int {
        var factorCount = 0
        val rootNumberToInt = sqrt(number.toDouble()).toInt()
        for (index in 1..rootNumberToInt) {
            if (index * index == number) factorCount++
            else if (number % index == 0) factorCount += 2
        }
        return factorCount
    }
}