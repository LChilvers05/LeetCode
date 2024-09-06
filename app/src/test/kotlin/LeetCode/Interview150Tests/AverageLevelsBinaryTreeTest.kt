package LeetCode

import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.doubleArrayOf

final class AverageLevelsBinaryTreeTest {
    
    @Test fun testSolution() {
        // given
        val sut = AverageLevelsBinaryTree()
        val tree1 = createTree(arrayOf(3,9,20,null,null,15,7))
        val tree2 = createTree(arrayOf(3,9,20,15,7))
        // when
        val result1 = sut.averageOfLevels(tree1)
        val result2 = sut.averageOfLevels(tree2)
        // then
        assertTrue(doubleArrayOf(3.00000,14.50000,11.00000).contentEquals(result1))
        assertTrue(doubleArrayOf(3.00000,14.50000,11.00000).contentEquals(result2))
    }
}