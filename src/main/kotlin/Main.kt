fun main() {
    println(Solution().solution(arrayOf("ayayeaya", "ayaaya", "woowooma", "mawooyeaya")))
}

class Solution {
    fun solution(babbling: Array<String>): Int {
        val speakableRegex = "aya|ye|woo|ma".toRegex()
        val unspeakableRegex = "ayaaya|yeye|woowoo|mama".toRegex()

        val speakableWords: List<String> = babbling.map { it.replace(regex = unspeakableRegex, "*") }
            .map { it.replace(regex = speakableRegex, "") }
            .filter { it == "" }
        return speakableWords.size
    }
}