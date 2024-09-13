// https://leetcode.com/problems/validate-binary-search-tree/submissions/1388603975/?envType=study-plan-v2&envId=top-interview-150
package LeetCode

final class IsValidBST {
    fun solution(root: TreeNode?): Boolean {
        if (root == null) return true
        var curr: Int? = null
        var result = true
        
        fun inOrder(node: TreeNode?) {
            if (node == null) return

            inOrder(node.left)

            if (curr != null && node.`val` <= curr!!) {
                result = false
                return
            }

            curr = node.`val`
            inOrder(node.right)
        }

        inOrder(root)
        return result
    }
}