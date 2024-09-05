package LeetCode

import kotlin.test.Test
import kotlin.test.assertEquals

final class SquareRootTest {
    
    @Test fun testSolution() {
        // given
        val sut = SquareRoot()
        // when
        val result1 = sut.solution(4)
        val result2 = sut.solution(8)
        val result3 = sut.solution(2147483647)
        // then
        assertEquals(2, result1)
        assertEquals(2, result2)
        assertEquals(46340, result3)
    }
}