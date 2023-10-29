fun main() {

}

class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var profitSum = 0

        var fruitIndex = 0
        val sortedScore = score.sortedDescending()
        while (fruitIndex <= score.size - m) {
            val fruitBox = mutableSetOf<Int>()
            for (index in fruitIndex until fruitIndex + m)
                fruitBox.add(sortedScore[index])
            profitSum += fruitBox.getMin() * m
            fruitIndex += m
        }

        return profitSum
    }
}

private fun Set<Int>.getMin(): Int {
    var min = first()
    forEach {
        if (it < min) min = it
    }
    return min
}