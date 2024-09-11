// https://leetcode.com/problems/binary-tree-right-side-view/?envType=study-plan-v2&envId=top-interview-150
package LeetCode

final class BinaryTreeRightSideView {
    fun solution(root: TreeNode?): IntArray {
        val rsv = mutableListOf<Int>()

        val queue = mutableListOf<TreeNode?>()
        queue.add(root)

        var levelCount = 0
        var nextLevelCount = 0

        while (queue.isNotEmpty()) {
            val curr = queue.removeAt(0)
            if (curr == null) continue;

            if (curr.left != null) {
                queue.add(curr.left)
                nextLevelCount++
            }
            if (curr.right != null) {
                queue.add(curr.right)
                nextLevelCount++
            }

            levelCount--

            if (levelCount <= 0) {
                rsv.add(curr.`val`)
                levelCount = nextLevelCount
                nextLevelCount = 0
            }
        }

        return rsv.toIntArray()
    }
}