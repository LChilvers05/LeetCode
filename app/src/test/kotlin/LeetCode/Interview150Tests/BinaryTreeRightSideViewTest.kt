package LeetCode

import kotlin.test.Test
import kotlin.test.assertTrue

final class BinaryTreeRightSideViewTest {
    
    @Test fun testSolution() {
        // given
        val sut = BinaryTreeRightSideView()
        val tree1 = createTree(arrayOf(1,2,3,null,5,null,4))
        val tree2 = createTree(arrayOf(1,null,3))
        val tree3 = createTree(arrayOf())
        val tree4 = createTree(arrayOf(1,2,3,18,5,4,null,6,null,null,null,null,8))
        // when
        val result1 = sut.solution(tree1)
        val result2 = sut.solution(tree2)
        val result3 = sut.solution(tree3)
        val result4 = sut.solution(tree4)
        // then
        assertTrue(intArrayOf(1,3,4).contentEquals(result1))
        assertTrue(intArrayOf(1,3).contentEquals(result2))
        assertTrue(intArrayOf().contentEquals(result3))
        assertTrue(intArrayOf(1,3,4,8).contentEquals(result4))
    }
}