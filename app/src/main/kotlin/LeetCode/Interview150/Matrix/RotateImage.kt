// https://leetcode.com/problems/rotate-image/submissions/1384202011/?envType=study-plan-v2&envId=top-interview-150
package LeetCode

final class RotateImage {
    fun solution(matrix: Array<IntArray>) {
        val n = matrix.size
        
        // left right bounds
        var l = 0
        var r = n-1

        // until all layers done
        while (l < r) {
            // top bottom bounds
            val t = l
            val b = r
            for (i in 0 until (r-l)) {
                // save top left
                val temp = matrix[t][l+i]
                // bottom left -> top left
                matrix[t][l+i] = matrix[b-i][l]
                // bottom right -> bottom left
                matrix[b-i][l] = matrix[b][r-i]
                // top right -> bottom right
                matrix[b][r-i] = matrix[t+i][r]
                // top left -> top right
                matrix[t+i][r] = temp
            }

            // decrease bounds
            l++
            r--
        }
    }
}