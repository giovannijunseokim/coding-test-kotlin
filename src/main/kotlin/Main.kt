fun main() {
    println("Answer is ${Solution().solution(4)}")
}

class Solution {
    fun solution(n: Int): Long = LongArray(2001).apply {
        this[1] = 1
        this[2] = 2
    }.let {
        for (i in 3..n) {
            it[i] = (it[i - 1] + it[i - 2]) % 1234567
        }
        it[n]
    }

    fun fibo() {

    }
}