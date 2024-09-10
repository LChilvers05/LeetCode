// https://leetcode.com/problems/sqrtx/?envType=study-plan-v2&envId=top-interview-150
package LeetCode

final class SquareRoot {
    fun solution(x: Int): Int {
        if (x == 0 || x == 1) return x
        // square root is just binary search!
        var l = 0
        var r = x

        while (l <= r) {
            val m = l + (r - l)/2
            if (x / m == m) {
                return m
            } else if (m > x / m) {
                r = m - 1
            } else {
                l = m + 1
            }
        }

        return r
    }
}