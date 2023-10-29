fun main() {

}

class Solution {
    fun solution(food: IntArray): String {
        val answer: String

        var firstPlayerFoodList = ""
        food.mapIndexed { index, foodCount ->
            val playerFoodCount = foodCount / 2
            for (i in 0 until playerFoodCount) {
                firstPlayerFoodList += index
            }
        }
        val secondPlayerFoodList: String = firstPlayerFoodList.reversed()

        answer = firstPlayerFoodList + "0" + secondPlayerFoodList
        return answer
    }
}