package LeetCode

import kotlin.test.Test
import kotlin.test.assertEquals

final class PowTest {
    
    @Test fun testSolution() {
        // given
        val sut = Pow()
        // when
        val result1 = sut.solution(2.0, 10)
        val result2 = sut.solution(2.10, 3)
        val result3 = sut.solution(2.0, -2)
        // then
        assertEquals(1024.0, result1)
        assertEquals(9.261000000000001, result2)
        assertEquals(0.25, result3)
    }
}