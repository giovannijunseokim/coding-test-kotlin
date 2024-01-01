fun main() {
    println("Answer is ${Solution().solution(4)}")
}

class Solution {
    fun solution(n: Int): Long = getFibonacci(n + 1)

    private tailrec fun getFibonacci(currentNumber: Int, acc: Long = 0, prevSum: Long = 1): Long =
        if (currentNumber == 0) acc
        else getFibonacci(currentNumber = currentNumber - 1, acc = prevSum, prevSum = (prevSum + acc) % 1234567)
}
