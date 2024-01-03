fun main() {
    println("Answer is ${Solution().solution(intArrayOf(7, 9, 1, 1, 4))}")
}

class Solution {
    fun solution(elements: IntArray): Int {
        val set = HashSet<Int>()
        val doubling = elements + elements

        for (i in 1..elements.size) {
            set.addAll((elements.indices).map {
                doubling.slice(it until it + i).sum()
            })
        }
        return set.size
    }
}