// https://leetcode.com/problems/isomorphic-strings/?envType=study-plan-v2&envId=top-interview-150

package LeetCode

final class IsIsomorphic {

    fun solution(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val map = mutableMapOf<Char, Char>()
        val values = mutableMapOf<Char, Int>()

        var result = true
        for (i in s.indices) {
            val a = s[i]
            val b = t[i]

            if (map[a] == null && values[b] == null) {
                map[a] = b
                values[b] = 0
            } else if (map[a] == b) {
                continue
            } else {
                result = false
                break
            }
        }

        return result
    }
}