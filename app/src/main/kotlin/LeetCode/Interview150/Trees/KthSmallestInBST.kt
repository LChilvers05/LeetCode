// https://leetcode.com/problems/kth-smallest-element-in-a-bst/?envType=study-plan-v2&envId=top-interview-150
package LeetCode 

final class KthSmallestInBST {
    fun solution(root: TreeNode?, n: Int): Int {
        var k = n
        var result = -1

        fun inOrder(node: TreeNode?) {
            if (node == null || k == 0) return

            inOrder(node.left)

            k--
            if (k ==0 ) {
                result = node.`val`
                return
            }

            inOrder(node.right)
        }

        inOrder(root)
        return result
    }
}