fun main() {

}

class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var profitSum = 0
        score.sortDescending()

        var fruitIndex = 0
        while (fruitIndex <= score.size - m) {
            val fruitBox = score.slice(fruitIndex until fruitIndex + m)
            profitSum += fruitBox.last() * m
            fruitIndex += m
        }

        return profitSum
    }
}