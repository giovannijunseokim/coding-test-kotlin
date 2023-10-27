fun main(args: Array<String>) {
    println(Solution().solution(intArrayOf(1, 1, -1, 1)))
}

class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 0

        for (firstStudent in 0..numbers.size - 3) {
            for (secondStudent in firstStudent + 1..numbers.size - 2)
                for (thirdStudent in secondStudent + 1 until numbers.size)
                    if (numbers[firstStudent] + numbers[secondStudent] + numbers[thirdStudent] == 0)
                        answer++
        }

        return answer
    }
}