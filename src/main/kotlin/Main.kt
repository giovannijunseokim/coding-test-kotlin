fun main() {
    Solution().also {
        println(
            it.solution(
                today = "2022.05.19",
                terms = arrayOf("A 6", "B 12", "C 3"),
                privacies = arrayOf(
                    "2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"
                )
            )
        )
    }
}

class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        val answer = mutableListOf<Int>()
        val mapTerms = mutableMapOf<Char, Int>().apply {
            terms.forEach { put(it.first(), it.substring(2).toInt()) }
        }
        val todayDate = Date(today)
        privacies.forEachIndexed { index, privacy ->
            val startDate = Date(privacy)
            val duration = requireNotNull(mapTerms[privacy.last()])
            val endDate = startDate.plusDuration(duration)
            if (endDate.isBeforeOf(todayDate)) answer.add(index + 1)
        }
        return answer.toIntArray()
    }
}

data class Date(private val year: Int, private val month: Int, private val date: Int) {
    constructor(stringDate: String) : this(
        year = stringDate.substring(0..3).toInt(),
        month = stringDate.substring(5..6).toInt(),
        date = stringDate.substring(8..9).toInt()
    )

    fun plusDuration(duration: Int): Date {
        val tempMonth = month.plus(duration)
        println(tempMonth)
        var newYear = year + (tempMonth / 12)
        var newMonth = tempMonth % 12
        var newDate = date - 1
        if (newMonth == 0) {
            newYear--
            newMonth = 12
        }
        if (newDate == 0) {
            newMonth--
            newDate = 28
        }
        return Date(newYear, newMonth, newDate)
    }

    fun isBeforeOf(today: Date): Boolean {
        if (this.year < today.year) return true
        if (this.year > today.year) return false

        if (this.month < today.month) return true
        if (this.month > today.month) return false

        return this.date < today.date
    }
}