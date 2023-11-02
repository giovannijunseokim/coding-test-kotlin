fun main() {
    println(Solution().solution(arrayOf("ACGQ", "BAC"), arrayOf("ABCTGBBC", "AAGQBABBABBZ")))
}

class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        var answer = listOf<Int>()
        // 리스트를 바꿈
        answer = targets.map { target ->
            // 각 target에 대한 리스트 -> 최소 키 리스트
            target.map { char ->
                // target의 char들에 대해
                keymap.map { btn -> btn.indexOf(char) + 1 }.filterNot { btnClickCount ->
                    btnClickCount < 1
                }.let { btnClickCountList ->
                    btnClickCountList.minOrNull() ?: -1
                } // char에 대한 버튼별 클릭 횟수 리스트
            }.let { clicksCharNeed ->
                if (clicksCharNeed.contains(-1)) -1
                else clicksCharNeed.sum()
            }
        }

        return answer.toIntArray()
    }
}