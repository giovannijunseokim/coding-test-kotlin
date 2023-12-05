fun main() {
    println(
        Solution().solution(
            arrayOf("muzi", "frodo", "apeach", "neo"),
            arrayOf("muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"),
            2
        )
    )
}

class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        println(report.map { it.split(" ") }
            .groupBy { it[1] }.asSequence().map { it.value.distinct() })
        return report.map { it.split(" ") }
            .groupBy { it[1] }
            .asSequence()
            .map { it.value.distinct() }
            .filter { it.size >= k }
            .flatten()
            .map { it[0] }
            .groupingBy { it }
            .eachCount()
            .run { id_list.map { getOrDefault(it, 0) }.toIntArray() }
    }

}