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
                println("$y, $x")
                if (wallpaper[y][x] == '#') {
                    println("matched : $y, $x")
                    if (y < startPosition.first) startPosition = Pair(y, startPosition.second)
                    if (x < startPosition.second) startPosition = Pair(startPosition.first, x)
                    if (y + 1 > endPosition.first) endPosition = Pair(y + 1, endPosition.second)
                    if (x + 1 > endPosition.second) endPosition = Pair(endPosition.first, x + 1)
                }
            }
        println("$startPosition, $endPosition")
        answer = (startPosition.toList() + endPosition.toList()).toIntArray()
        return answer
    }
}