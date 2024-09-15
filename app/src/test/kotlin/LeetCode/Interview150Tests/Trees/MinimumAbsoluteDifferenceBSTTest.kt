package LeetCode

import kotlin.test.Test
import kotlin.test.assertEquals

final class MinimumAbsoluteDifferenceBSTTest {
    
    @Test fun testSolution() {
        // given
        val sut = MinimumAbsoluteDifferenceBST()
        val tree1 = createTree(arrayOf(4,2,6,1,3))
        val tree2 = createTree(arrayOf(1,0,48,null,null,12,49))
        // when
        val result1 = sut.solution(tree1)
        val result2 = sut.solution(tree2)
        // then
        assertEquals(1, result1)
        assertEquals(1, result2)

    }
}