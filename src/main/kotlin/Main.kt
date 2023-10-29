fun main() {

}

class Solution {
    fun solution(food: IntArray): String {
        val answer: String

        var firstPlayerFoodList = ""
        food.mapIndexed { index, foodCount ->
            val playerFoodCount = foodCount / 2
            firstPlayerFoodList += index.toString().repeat(playerFoodCount)
        }
        val secondPlayerFoodList: String = firstPlayerFoodList.reversed()

        answer = firstPlayerFoodList + "0" + secondPlayerFoodList
        return answer
    }
}