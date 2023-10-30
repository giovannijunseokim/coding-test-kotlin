fun main() {
    println(Solution().solution(10, 3, 2))
}

class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        return IntArray(number) { index -> calculateFactors(index + 1) }
            .fold(0) { ironAmount, knightPower ->
                if (knightPower > limit) ironAmount + power
                else ironAmount + knightPower
            }
    }

    private fun calculateFactors(number: Int): Int {
        var factorCount = 0
        var index = 1
        while (index * index < number) {
            if (number % index++ == 0) factorCount += 2
        }
        if (index * index == number) factorCount++
        return factorCount
    }
}