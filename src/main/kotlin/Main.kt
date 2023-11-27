fun main() {
    println(Solution().solution("...!@BaT#*..y.abcdefghijklm"))
}

class Solution {
    fun solution(new_id: String): String {
        return new_id.lowercase().filter { it in 'a'..'z' || it in '0'..'9' || it == '-' || it == '_' || it == '.' }
            .let {
                it.filterIndexed { index, c ->
                    if (index < it.length - 1) {
                        c != '.' || it[index + 1] != '.'
                    } else true
                }
            }.replace("..", ".").removePrefix(".").removeSuffix(".").let {
                if (it.isEmpty()) "a"
                else if (it.length >= 16) {
                    it.substring(0 until 15).removeSuffix(".")
                } else it
            }.let { if (it.length == 1) it.repeat(3) else if (it.length == 2) it.plus(it.last()) else it }
    }
}