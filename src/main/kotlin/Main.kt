fun main() {
    Solution().also {
        println(
            it.solution(
                ingredient = intArrayOf(2, 1, 1, 2, 3, 1, 2, 3, 1)
            )
        )
    }
}

class Solution {
    fun solution(ingredient: IntArray): Int {
        var answer: Int = 0
        var index = 0
        val mutableIngredient = ingredient.toMutableList()
        while (index + 3 < mutableIngredient.size) {
            if (mutableIngredient[index] == 빵 && mutableIngredient[index + 1] == 야채 &&
                mutableIngredient[index + 2] == 고기 && mutableIngredient[index + 3] == 빵
            ) {
                mutableIngredient.removeAt(index + 3)
                mutableIngredient.removeAt(index + 2)
                mutableIngredient.removeAt(index + 1)
                mutableIngredient.removeAt(index)
                index = if (index < 3) 0 else index - 3
                answer++
            } else index++
        }
        return answer
    }

    companion object {
        const val 빵 = 1
        const val 야채 = 2
        const val 고기 = 3
    }
}