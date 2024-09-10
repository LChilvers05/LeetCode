// https://leetcode.com/problems/minimum-absolute-difference-in-bst/submissions/1381501214/?envType=study-plan-v2&envId=top-interview-150
package LeetCode

final class MinimumAbsoluteDifferenceBST {
    fun solution(root: TreeNode?): Int {
        // inorder traversal to then compare adjacent elements
        var result = Int.MAX_VALUE
        val stack = mutableListOf<TreeNode>()
        var prev = Int.MAX_VALUE
        var node = root
        while (stack.isNotEmpty() || node != null) {
            // go to left-most
            while (node != null) {
                stack.add(node)
                node = node.left
            }

            node = stack.removeAt(stack.lastIndex)

            result = Math.min(
                result, 
                Math.abs(prev - node.`val`)
            )

            prev = node.`val`
            node = node.right
        }

        return result
    }
}