fun main() {
    println(
        Solution().solution(
            arrayOf("AN", "CF", "MJ", "RT", "NA"), intArrayOf(5, 3, 2, 7, 5)
        )
    )
}

class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        val scoreMap = mutableMapOf('R' to 0, 'T' to 0, 'C' to 0, 'F' to 0, 'J' to 0, 'M' to 0, 'A' to 0, 'N' to 0)
        choices.zip(survey).forEach {
            if (it.first > 4) {
                scoreMap[it.second.last()] = scoreMap[it.second.last()]!!.plus(it.first - 4)
            }
            if (it.first < 4) {
                scoreMap[it.second.first()] = scoreMap[it.second.first()]!!.plus(4 - it.first)
            }
        }
        StringBuilder().apply {
            append(if (scoreMap['R']!! >= scoreMap['T']!!) 'R' else 'T')
            append(if (scoreMap['C']!! >= scoreMap['F']!!) 'C' else 'F')
            append(if (scoreMap['J']!! >= scoreMap['M']!!) 'J' else 'M')
            append(if (scoreMap['A']!! >= scoreMap['N']!!) 'A' else 'N')
        }.also { return it.toString() }
    }
}