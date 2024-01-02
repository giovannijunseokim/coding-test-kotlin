fun main() {
    println("Answer is ${Solution().solution(2, intArrayOf(5, 1, 1, 1, 1, 2, 2, 2, 3))}")
}

class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        val tangerineMap: MutableMap<Int, Int> = mutableMapOf()
        tangerine.forEach {
            tangerineMap[it] = tangerineMap[it]?.plus(1) ?: 1
        }
        val tangerineList = tangerineMap.toList().sortedBy { it.second }
        var index = 0
        var count = tangerine.size
        while (count != k) {
            val min = tangerineList[index].first
            if (tangerineMap[min] == 1) {
                tangerineMap.remove(min)
                index++
            } else tangerineMap[min] = tangerineMap[min]!!.minus(1)
            count--
        }

        return tangerineMap.size
    }
}