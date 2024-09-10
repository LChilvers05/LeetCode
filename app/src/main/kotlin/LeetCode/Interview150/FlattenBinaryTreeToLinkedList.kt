// https://leetcode.com/problems/flatten-binary-tree-to-linked-list/submissions/1385339837/?envType=study-plan-v2&envId=top-interview-150
package LeetCode

final class FlattenBinaryTreeToLinkedList {
    fun solution(root: TreeNode?): TreeNode? {
        if (root == null) return null
        val stack = mutableListOf<TreeNode>()
        stack.add(root)

        var prev: TreeNode? = null
        lateinit var curr: TreeNode
        while (stack.isNotEmpty()) {
            curr = stack.removeAt(stack.lastIndex)
            if (prev != null) {
                prev.right = curr
                prev.left = null
            }

            if (curr.right != null) stack.add(curr.right!!)
            if (curr.left != null) stack.add(curr.left!!)
            prev = curr
        }

        return root
    }
}