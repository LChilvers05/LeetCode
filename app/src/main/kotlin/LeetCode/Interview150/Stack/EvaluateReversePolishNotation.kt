// https://leetcode.com/problems/evaluate-reverse-polish-notation/?envType=study-plan-v2&envId=top-interview-150
package LeetCode

final class EvaluateReversePolishNotation {
    fun solution(tokens: Array<String>): Int {
        val stack = mutableListOf<Int>()

        for (token in tokens) {
            val t = token.toIntOrNull()
            if (t != null) {
                stack.add(t)
                continue
            }

            val b = stack.removeAt(stack.lastIndex)
            val a = stack.removeAt(stack.lastIndex)

            when (token) {
                "+" -> stack.add(a + b)
                "-" -> stack.add(a - b)
                "/" -> stack.add(a / b)
                "*" -> stack.add(a * b)
            }
        }

        return stack.removeAt(stack.lastIndex)
    }
}