import java.lang.Integer.min

fun main() {
    println(Solution().solution(arrayOf("ACGQ", "BAC"), arrayOf("ABCTGBBC", "AAGQBABBABBZ")))
}

class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        val answer = mutableListOf<Int>()
        targets.forEach { target ->
            var btnClickCount = 0
            for (targetCharIndex in target.indices) { // target[targetCharIndex] == 한 타겟의 chars
                var minBtnCount: Int? = null
                for (btnIndex in keymap.indices) { // keymap[btnIndex]는 각각의 버튼들
                    if (!keymap[btnIndex].contains(target[targetCharIndex])) {
                        continue
                    }
                    var tempClickCount = 0 // target의 한 char에 대한 클릭 횟수
                    while (tempClickCount < keymap[btnIndex].length) {
                        if (target[targetCharIndex] == keymap[btnIndex][tempClickCount]) {
                            minBtnCount = if (minBtnCount == null) tempClickCount + 1
                            else min(minBtnCount, tempClickCount + 1)
                            break
                        }
                        tempClickCount++
                    }
                }
                if (minBtnCount == null) {
                    // 버튼들을 통해 char를 만들 수 없음 -> -1을 넣어야 함
                    btnClickCount = -1
                    break
                } else btnClickCount += minBtnCount // char마다 버튼 클릭 횟수의 총합을 넣어야 하므로
            }
            answer.add(btnClickCount)
        }
        return answer.toIntArray()
    }
}