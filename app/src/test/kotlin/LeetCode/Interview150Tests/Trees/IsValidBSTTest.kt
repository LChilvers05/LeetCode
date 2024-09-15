package LeetCode

import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertFalse

final class IsValidBSTTest {
    @Test fun testSolution() {
        // given
        val sut = IsValidBST()
        val tree1 = createTree(arrayOf(3,1,5,null,null,4,6,null,null,null))
        val tree2 = createTree(arrayOf(5,1,4,null,null,3,6))
        val tree3 = createTree(arrayOf(2, 2, 2))
        val tree4 = createTree(arrayOf(0))
        // when
        val result1 = sut.solution(tree1)
        val result2 = sut.solution(tree2)
        val result3 = sut.solution(tree3)
        val result4 = sut.solution(tree4)
        // then
        assertTrue(result1)
        assertFalse(result2)
        assertFalse(result3)
        assertTrue(result4)
    }
}