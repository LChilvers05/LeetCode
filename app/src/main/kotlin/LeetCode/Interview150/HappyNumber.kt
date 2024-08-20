// https://leetcode.com/problems/happy-number/?envType=study-plan-v2&envId=top-interview-150

package LeetCode

final class HappyNumber {

    fun solution(n: Int): Boolean {

        val map = mutableMapOf<Int, Int>()
        var ssq = n
        
        while (ssq != 1) {

            var sum = 0
            while (ssq > 0) {
                val digit = ssq % 10
                sum += digit*digit
                ssq /= 10
            }
            ssq = sum

            if (map.containsKey(ssq)) break

            map[sum] = 1
        }

        return (ssq == 1)
    }
}