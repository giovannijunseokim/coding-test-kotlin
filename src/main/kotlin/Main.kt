fun main() {

}

class Solution {
    fun solution(k: Int, scores: IntArray): IntArray {
        val tempList = mutableListOf<Int>()
        val answerList = scores.map { score ->
            tempList.run {
                add(score)
                sortDescending()
                if (size < k) last()
                else slice(0 until k).last()
            }
        }
        return answerList.toIntArray()
    }
}