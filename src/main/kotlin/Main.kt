import kotlin.math.pow

fun main() {
    println(Solution().solution(45))
}

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = n
        val ternary: MutableList<Int> = mutableListOf()
        while (answer >= 3) {
            ternary.add(answer % 3)
            answer /= 3
        }
        return ternary.plus(answer).reversed().mapIndexed { index, element ->
            element * 3.toDouble().pow(index)
        }.sum().toInt()
    }
}