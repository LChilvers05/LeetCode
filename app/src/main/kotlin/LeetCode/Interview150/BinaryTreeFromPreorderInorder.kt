package LeetCode

final class BinaryTreeFromPreorderInorder {
    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
        if (preorder.isEmpty()) return null

        val value = preorder[0]
        val root = TreeNode(value)
        if (preorder.size == 1) return root

        var i = 0;
        while (inorder[i] != value) i++

        root.left = buildTree(
            preorder.copyOfRange(1, i+1),
            inorder.copyOfRange(0, i)
        )
        root.right = buildTree(
            preorder.copyOfRange(i+1, preorder.size),
            inorder.copyOfRange(i+1, inorder.size)
        )

        return root
    }
}