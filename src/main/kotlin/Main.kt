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

        val idReportMap: MutableMap<String, MutableSet<String>> = id_list.associateWith {
            mutableSetOf<String>()
        }.toMutableMap().apply {
            report.forEach { this[it.substringBefore(' ')]?.add(it.substringAfter(' ')) }
        }

        val idReportedMap: MutableMap<String, Int> = mutableMapOf<String, Int>().apply {
            idReportMap.forEach {
                it.value.forEach { reportedUser ->
                    if (this[reportedUser] != null) this[reportedUser] = this[reportedUser]!! + 1
                    else this[reportedUser] = 1
                }
            }
        }

        return idReportMap.map { it.value.count { idReportedMap.filter { it.value >= k }.map { it.key }.contains(it) } }
            .toIntArray()
    }
}