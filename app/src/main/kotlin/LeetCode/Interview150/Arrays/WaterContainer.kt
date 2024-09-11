// https://leetcode.com/problems/container-with-most-water/?envType=study-plan-v2&envId=top-interview-150
package LeetCode

final class WaterContainer {
    // two pointers at ends
    // move pointer pointing to smaller height
    // intuition: try and maximise water by finding highter bars,
    // if counter-productive by reducing width,
    // best water area has been recorded anyway
    fun solution(height: IntArray): Int {
        var best = 0

        var i = 0
        var j = height.lastIndex

        while (i < j) {
            val area = Math.min(height[i], height[j]) * (j-i)
            if (area > best) best = area

            if (height[i] < height[j]) {
                i++
            } else {
                j--
            }
        }

        return best
    }
}