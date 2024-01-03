fun main() {
    println("Answer is ${Solution().solution(intArrayOf(7, 9, 1, 1, 4))}")
}

class Solution {
    fun solution(elements: IntArray): Int {
        val answerSet = mutableSetOf<Int>()
        answerSet.addAll(elements.toList())

        var length = 2
        var startIndex = 0

        while (length <= elements.size) {
            while (startIndex < elements.size) {
                var index = startIndex
                var sum = 0
                while (index - startIndex + 1 <= length) {
                    sum += elements[index.rem(elements.size)]
                    index++
                }
                answerSet.add(sum)
                startIndex++
            }
            length++
            startIndex = 0
        }

        return answerSet.size
    }
}