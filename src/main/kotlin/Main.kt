fun main() {
    println(Solution().solution("...!@BaT#*..y.abcdefghijklm"))
}

class Solution {
    fun solution(new_id: String): String {
        return new_id.lowercase().filter { it.isLowerCase() || it.isDigit() || it == '-' || it == '_' || it == '.' }
            .replace("[.]*[.]".toRegex(), ".").removePrefix(".").removeSuffix(".").let {
                if (it.isEmpty()) "a"
                else if (it.length >= 16) {
                    it.substring(0 until 15).removeSuffix(".")
                } else it
            }.let {
                StringBuilder(it).run {
                    while (it.length < 3) append(it.last())
                    toString()
                }
            }
    }
}