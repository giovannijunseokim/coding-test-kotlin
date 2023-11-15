import kotlin.math.max

fun main() {
    Solution().also {
        println(it.solution(intArrayOf(1, 2, 3, 4, 5)))
    }
}

class Solution {
    fun solution(answers: IntArray): IntArray {
        val answerMap: MutableMap<Int, Int> = mutableMapOf(1 to 0, 2 to 0, 3 to 0)
        val firstPersonAnswer = intArrayOf(1, 2, 3, 4, 5)
        val secondPersonAnswer = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        val thirdPersonAnswer = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        val studentsAnswers = listOf(firstPersonAnswer, secondPersonAnswer, thirdPersonAnswer)

        answers.forEachIndexed { index, answer ->
            studentsAnswers.forEachIndexed { studentIndex, studentAnswers ->
                if (studentAnswers[index % studentAnswers.size] == answer)
                    answerMap[studentIndex] = answerMap[studentIndex]?.plus(1) ?: 1
            }
        }

        return answerMap.filter { it.value == answerMap.values.maxOrNull() }.keys.toMutableList().map { it.plus(1) }
            .sorted().toIntArray()
    }
}