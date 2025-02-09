// https://leetcode.com/problems/simplify-path/

package LeetCode

 class SimplifyPath {

    fun solution(path: String): String {

        val stack = mutableListOf<String>()

        for (dir in path.split('/')) {
            if (dir == "..") {
                if (stack.isNotEmpty()) stack.removeAt(stack.size-1)
            } else if (dir != "." && dir.isNotEmpty()) {
                stack.add(dir)
            }
        }

        return "/${stack.joinToString(separator = "/")}"
    }
}