// https://leetcode.com/problems/spiral-matrix/?envType=study-plan-v2&envId=top-interview-150

package LeetCode

final class SpiralMatrix {

    fun solution(matrix: Array<IntArray>): List<Int> {

        val result = mutableListOf<Int>()
        val w = matrix[0].size
        val h = matrix.size
        val bounds = mutableListOf(-1, w, h, -1)
        val dir = listOf(1, 1, -1, -1)
        var ptr = 0

        var x = 0
        var y = 0
        // until all elements reached
        while (result.size < w * h) {
            val next = (ptr+1) % bounds.size

            var a = if (ptr == 0 || ptr == 2) x else y

            // traverse until bounds reached
            while (a != bounds[next]) {
                if (ptr == 0 || ptr == 2) {
                    result.add(matrix[y][a])
                } else {
                    result.add(matrix[a][x])
                }

                a += dir[ptr]
            }

            // update starting points
            if (ptr == 0 || ptr == 2) {
                x = a - dir[ptr]
                y += dir[next]
            } else {
                y = a - dir[ptr]
                x += dir[next]
            }

            // reduce bounds
            if (ptr == 0 || ptr == 3) { 
                bounds[ptr]++ 
            } else {
                bounds[ptr]--
            }

            // change direction
            ptr = next
        }

        return result
    }
}