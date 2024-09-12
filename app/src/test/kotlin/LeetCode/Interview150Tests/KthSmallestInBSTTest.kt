package LeetCode

import kotlin.test.Test
import kotlin.test.assertEquals

final class KthSmallestInBSTTest {
    
    @Test fun testSolution() {
        // given
        val sut = KthSmallestInBST()
        val tree1 = createTree(arrayOf(3,1,4,null,2))
        val tree2 = createTree(arrayOf(5,3,6,2,4,null,null,1))
        // when
        val result1 = sut.solution(tree1, 1)
        val result2 = sut.solution(tree2, 3)
        // then
        assertEquals(1, result1)
        assertEquals(3, result2)
    }
}