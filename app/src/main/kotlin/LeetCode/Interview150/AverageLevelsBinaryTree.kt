// https://leetcode.com/problems/average-of-levels-in-binary-tree/description/?envType=study-plan-v2&envId=top-interview-150

package LeetCode

final class AverageLevelsBinaryTree {
    fun averageOfLevels(root: TreeNode?): DoubleArray {
        
        val result = mutableListOf<Double>()
        val queue = ArrayDeque<TreeNode>()
        root?.let { queue.add(it) }

        while (queue.isNotEmpty()) {
            val levelWidth = queue.size
            var sum = 0.0

            repeat(levelWidth) {
                val curr = queue.removeFirst()
                sum += curr.`val`

                curr.left?.let { queue.add(it) }
                curr.right?.let { queue.add(it) }
            }

            result.add(sum / levelWidth)
        }
        
        return result.toDoubleArray()
    }
}