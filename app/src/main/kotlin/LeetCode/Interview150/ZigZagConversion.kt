// https://leetcode.com/problems/zigzag-conversion/?envType=study-plan-v2&envId=top-interview-150
package LeetCode

final class ZigZagConversion {
    fun solution(s: String, numRows: Int): String {
        if (numRows == 1) return s
        
        var sb = StringBuilder()
        var index = MutableList(numRows) { 0 }
        var ptr = 0
        var dir = 1

        for (c in s) {
            sb.insert(index[ptr], c)
            for (i in ptr until index.size) index[i]++

            ptr += dir
            if (ptr == 0 || ptr == numRows-1) dir *= -1
        }

        return sb.toString()
    }
}