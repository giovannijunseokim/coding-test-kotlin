fun main() {
    println(Solution().solution(arrayOf("ayayeaya", "ayaaya", "woowooma", "mawooyeaya")))
}

class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer = 0
        val wordsCanSpeak = arrayListOf("aya", "ye", "woo", "ma")

        babbling.forEach { word ->
            var removableWord = word

            for (index in 0 until wordsCanSpeak.size) {
                val wordCanSpeak = wordsCanSpeak[index]
                var tempStartIndex: Int? = null

                while (removableWord.contains(wordCanSpeak)) {
                    val startIndex = removableWord.indexOf(wordCanSpeak)
                    if (tempStartIndex == startIndex) break
                    removableWord = removableWord.replaceRange(startIndex until startIndex + wordCanSpeak.length, " ")
                    tempStartIndex = startIndex + 1
                }

                if (removableWord.isBlank()) {
                    answer++
                    break
                }
            }
        }

        return answer
    }
}