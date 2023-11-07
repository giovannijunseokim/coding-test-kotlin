fun main() {
    println(Solution().solution(arrayOf("OSO", "OOO", "OXO", "OOO"), arrayOf("E 2", "S 3", "W 1")))
}

class Solution {
    /** 출발 위치 찾기 */
    private fun findStart(park: Array<String>): MutableList<Int> {
        for (y in park.indices)
            for (x in park[y].indices)
                if (park[y][x] == 'S')
                    return mutableListOf(y, x)
        return mutableListOf(0, 0)
    }

    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        /** 방향 입력 시 방향으로 한 칸 변환하는 Pair 를 얻는 Map */
        val directions = mapOf('E' to (0 to 1), 'W' to (0 to -1), 'N' to (-1 to 0), 'S' to (1 to 0))
        /** route 배열을 방향, step Pair 의 배열로 변경 */
        return routes.map { it[0] to it.drop(2).toInt() }
            .fold(findStart(park)) { currentPosition, (direction, distance) ->
                val prevPosition = currentPosition.toMutableList() // [Y축 위치, X축 위치]
                val nextPosition = currentPosition.toMutableList() // [Y축 위치, X축 위치]
                repeat(distance) {
                    nextPosition[0] += directions[direction]!!.first // Y축 위치 변경 (1칸씩)
                    nextPosition[1] += directions[direction]!!.second // X축 위치 변경 (1칸씩)
                    if (!(0 <= nextPosition[0] && nextPosition[0] < park.size && 0 <= nextPosition[1] && nextPosition[1] < park[0].length && park[nextPosition[0]][nextPosition[1]] != 'X'))
                        return@fold prevPosition
                }
                return@fold nextPosition
            }.toIntArray()
    }
}