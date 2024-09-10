// https://leetcode.com/problems/reverse-words-in-a-string/submissions/1349058289/?envType=study-plan-v2&envId=top-interview-150

package LeetCode

final class ReverseWordsInAString {

    fun solution(s: String): String {

        var result = StringBuilder()
        var i = 0

        for (char in s) {
            if (char == ' ') {
                if (i != 0) {
                    result.insert(0, ' ')
                }
                i = 0
            } else {
                result.insert(i, char)
                i++
            }
        }

        if (result[0] == ' ') {
            result.deleteCharAt(0)
        }

        return result.toString()
    }
}

