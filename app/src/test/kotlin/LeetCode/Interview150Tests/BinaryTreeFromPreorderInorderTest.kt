package LeetCode

import kotlin.test.Test
import kotlin.test.assertTrue

final class BinaryTreeFromPreorderInorderTest {
    
    @Test fun testSolution() {
        // given
        val sut = BinaryTreeFromPreorderInorder()

        val expected1 = createTree(arrayOf(3,9,20,null,null,15,7))
        val expected2 = createTree(arrayOf(-1))
        val expected3 = createTree(arrayOf(1,2,3,4,5,7,8,null,null,6,null,null,null,9))
        // when
        val result1 = sut.buildTree(
            intArrayOf(3,9,20,15,7), 
            intArrayOf(9,3,15,20,7)
        )
        val result2 = sut.buildTree(
            intArrayOf(-1), 
            intArrayOf(-1)
        )
        val result3 = sut.buildTree(
            intArrayOf(1, 2, 4, 5, 6, 3, 7, 8, 9), 
            intArrayOf(4, 2, 6, 5, 1, 7, 3, 9, 8)
        )

        // then
        assertTrue(areTreesEqual(expected1, result1))
        assertTrue(areTreesEqual(expected2, result2))
        assertTrue(areTreesEqual(expected3, result3))
    }
}