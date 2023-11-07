fun main() {
    println(Solution().solution(arrayOf("OSO", "OOO", "OXO", "OOO"), arrayOf("E 2", "S 3", "W 1")))
}

class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        val minX = 0
        val minY = 0

        val maxX = park.first().length - 1
        val maxY = park.size - 1

        var currentX: Int = -1
        var currentY: Int = -1

        park.forEachIndexed { startStringIndex, string ->
            val startCharIndex = string.indexOf('S')
            if (startCharIndex != -1) {
                currentX = startCharIndex
                currentY = startStringIndex
                return@forEachIndexed
            }
        }

        fun checkCanMove(opCode: Char, step: Int): Boolean {
            var tempX = currentX
            var tempY = currentY

            when (opCode) {
                'E' -> {
                    if ((tempX + step) !in minX..maxX) return false
                    for (index in 0 until step) {
                        tempX++
                        if (park[tempY][tempX] == 'X') return false
                    }
                }

                'W' -> {
                    if ((tempX - step) !in minX..maxX) return false
                    for (index in 0 until step) {
                        tempX--
                        if (park[tempY][tempX] == 'X') return false
                    }
                }

                'S' -> {
                    if ((tempY + step) !in minY..maxY) return false
                    for (index in 0 until step) {
                        tempY++
                        if (park[tempY][tempX] == 'X') return false
                    }
                }

                'N' -> {
                    if ((tempY - step) !in minY..maxY) return false
                    for (index in 0 until step) {
                        tempY--
                        if (park[tempY][tempX] == 'X') return false
                    }
                }
            }
            return true
        }

        fun moveTo(opCode: Char, step: Int) {
            if (!checkCanMove(opCode, step)) return
            when (opCode) {
                'E' -> {
                    currentX += step
                }

                'W' -> {
                    currentX -= step
                }

                'S' -> {
                    currentY += step
                }

                'N' -> {
                    currentY -= step
                }
            }
        }

        routes.forEach { route ->
            moveTo(route.first(), Character.getNumericValue(route.last()))
            println("$currentY, $currentX")
        }
        return intArrayOf(currentY, currentX)
    }
}