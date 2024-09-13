// https://leetcode.com/problems/binary-tree-level-order-traversal/description/?envType=study-plan-v2&envId=top-interview-150
package LeetCode

final class BinaryTreeLevelOrderTraversal {
    fun solution(root: TreeNode?): List<List<Int>> {
        if (root == null) return emptyList()
        val result = mutableListOf<List<Int>>()
        var level = mutableListOf<Int>()

        val queue = mutableListOf<TreeNode?>()
        queue.add(root)

        var levelCount = 1
        var nextLevelCount = 0

        while (queue.isNotEmpty()) {
            val curr = queue.removeAt(0)
            if (curr == null) continue
            if (curr.left != null) {
                nextLevelCount++
                queue.add(curr.left)
            }
            if (curr.right != null) {
                nextLevelCount++
                queue.add(curr.right)
            }

            level.add(curr.`val`)
            levelCount--
            if (levelCount == 0) {
                levelCount = nextLevelCount
                nextLevelCount = 0
                result.add(level)
                level = mutableListOf<Int>()
            }
        }

        return result
    }
}