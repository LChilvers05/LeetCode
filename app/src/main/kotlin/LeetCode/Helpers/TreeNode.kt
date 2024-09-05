package LeetCode

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun createTree(bfs: Array<Int?>): TreeNode? {
    if (bfs.isEmpty() || bfs[0] == null) return null

    val root = TreeNode(bfs[0]!!)
    
    val queue: ArrayDeque<TreeNode> = ArrayDeque()
    queue.add(root)

    var i = 1
    while (i < bfs.size) {
        val currentNode = queue.removeFirst()

        if (i < bfs.size && bfs[i] != null) {
            currentNode.left = TreeNode(bfs[i]!!)
            queue.add(currentNode.left!!)
        }
        i++

        if (i < bfs.size && bfs[i] != null) {
            currentNode.right = TreeNode(bfs[i]!!)
            queue.add(currentNode.right!!)
        }
        i++
    }

    return root
}

fun areTreesEqual(tree1: TreeNode?, tree2: TreeNode?): Boolean {
    if (tree1 == null && tree2 == null) return true
    if (tree1 == null || tree2 == null || tree1.`val` != tree2.`val`) return false

    return areTreesEqual(tree1.left, tree2.left) && areTreesEqual(tree1.right, tree2.right)
}

