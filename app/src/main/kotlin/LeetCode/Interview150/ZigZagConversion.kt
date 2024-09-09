// https://leetcode.com/problems/zigzag-conversion/?envType=study-plan-v2&envId=top-interview-150
package LeetCode

final class ZigZagConversion {
    // add to 2D array and read row-by-row
    fun solution(s: String, numRows: Int): String {
        if (numRows == 1) return s
        val matrix: Array<Array<Char?>> = Array(numRows) { 
            Array(s.length) { null }
        }
        
        // build matrix
        var zig = false
        var i = 0
        var j = 0
        for (c in s) {
            matrix[i][j] = c
            if (i == matrix.lastIndex || i == 0) zig = !zig // toggle down <-> up-across
            i = if (zig) i+1 else i-1
            if (!zig) j++
        }

        // build string from matrix
        val sb = StringBuilder()
        for (y in matrix.indices) {
            for (x in matrix[y].indices) {
                if (matrix[y][x] == null) continue
                sb.append(matrix[y][x])
            }
        }

        return sb.toString()
    }
}