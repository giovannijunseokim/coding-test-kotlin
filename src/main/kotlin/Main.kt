import java.util.*

fun main() {

}

class Solution {
    fun solution(k: Int, scores: IntArray): IntArray {
        val answerList: MutableList<Int> = mutableListOf()
        val scorePriorityQueue: PriorityQueue<Int> = PriorityQueue()
        scores.forEach { score ->
            scorePriorityQueue.add(score)
            if (scorePriorityQueue.size > k) scorePriorityQueue.poll()
            answerList.add(scorePriorityQueue.peek())
        }

        return answerList.toIntArray()
    }
}