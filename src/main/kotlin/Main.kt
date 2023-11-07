fun main() {
    Solution().also { println(it.solution(arrayOf(".#...", "..#..", "...#."))) }
}

class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        val answer: IntArray

        var startPosition = Pair(wallpaper.size - 1, wallpaper[0].length)
        var endPosition = Pair(0, 0)

        for (y in wallpaper.indices)
            for (x in wallpaper.first().indices) {
                if (wallpaper[y][x] == '#') {
                    startPosition = Pair(minOf(y, startPosition.first), minOf(x, startPosition.second))
                    endPosition = Pair(maxOf(y + 1, endPosition.first), maxOf(x + 1, endPosition.second))
                }
            }
        println("$startPosition, $endPosition")
        answer = (startPosition.toList() + endPosition.toList()).toIntArray()
        return answer
    }
}