// https://leetcode.com/problems/palindrome-number/?envType=study-plan-v2&envId=top-interview-150
package LeetCode

final class PalindromeNumber {
    fun solution(x: Int): Boolean {
        if (x < 0) return false

        var reversed = 0
        var temp = x

        while (temp > 0) {
            val digit = temp % 10
            reversed = (reversed * 10) + digit
            temp /= 10
        }

        return (reversed == x)
    }
}