// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/?envType=study-plan-v2&envId=top-interview-150
package LeetCode

final class IndexOfFirstOccurence {

    fun solution(haystack: String, needle: String): Int {
        if (haystack == needle) return 0

        var index = -1
        for (i in haystack.indices) {
            var j = minOf(haystack.length, i + needle.length)

            val s = if (needle.length == 1) 
                    haystack[i].toString() else 
                    haystack.substring(i, j)

            if (s != needle) continue
            index = i
            break
        }

        return index
    }
}