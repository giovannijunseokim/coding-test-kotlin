fun main() {
    println(Solution().solution(5, intArrayOf(5, 3), intArrayOf(4, 2)))
}

class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        val lostStudents = lost.sorted().toMutableSet()
        val reserveStudents = reserve.sorted().toMutableSet()

        lost.forEach { lostStudent ->
            if (reserveStudents.contains(lostStudent)) {
                lostStudents.remove(lostStudent)
                reserveStudents.remove(lostStudent)
            }
        }

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