// https://leetcode.com/problems/powx-n/description/?envType=study-plan-v2&envId=top-interview-150
package LeetCode

final class Pow {
    fun solution(a: Double, b: Int): Double {
        if (b == 0) return 1.0

        var base = a
        var exp = b

        if (b < 0) {
            base = 1/a
            exp = -b
        }

        var result = 1.0
        while (exp > 0) {
            if (exp % 2 != 0) result *= base

            base *= base
            exp /= 2
        }

        return result
    }
}