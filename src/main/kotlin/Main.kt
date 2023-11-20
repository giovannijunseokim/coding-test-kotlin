fun main() {
    println(Solution().solution(3, intArrayOf(1), intArrayOf(1)))
}

class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        val lostStudents = (lost.sorted().toSet() - reserve.sorted().toSet()).toMutableSet()
        val reserveStudents = (reserve.sorted().toSet() - lost.sorted().toSet())

        reserveStudents.forEach { reserveStudent ->
            if (lostStudents.contains(reserveStudent - 1)) {
                lostStudents.remove(reserveStudent - 1)
            } else if (lostStudents.contains(reserveStudent + 1)) {
                lostStudents.remove(reserveStudent + 1)
            }
        }
        return n - lostStudents.size
    }
}