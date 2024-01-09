import java.util.*

fun main() {
    println("Answer is ${Solution().solution("(((")}")
}

class Solution {
    fun solution(s: String): Int {
        val sb = StringBuilder(s)
        var answer = 0
        repeat(s.length) {
            if (sb.append(sb.first()).deleteAt(0).toString().isValid()) answer++
        }
        return answer
    }

    private fun String.isValid(): Boolean {
        val stack = Stack<Char>()
        this.forEach {
            when (it) {
                '(', '{', '[' -> {
                    stack.push(it)
                }

                ')' -> {
                    if (stack.isEmpty()) return false
                    if (stack.isNotEmpty() && stack.peek() == '(') stack.pop()
                }

                '}' -> {
                    if (stack.isEmpty()) return false
                    if (stack.peek() == '{') stack.pop() else return false
                }

                ']' -> {
                    if (stack.isEmpty()) return false
                    if (stack.peek() == '[') stack.pop() else return false
                }
            }
        }
        return stack.isEmpty()
    }
}