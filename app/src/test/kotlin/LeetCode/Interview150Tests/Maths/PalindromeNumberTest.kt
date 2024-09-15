package LeetCode

import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertFalse

final class PalindromeNumberTest {
    
    @Test fun testSolution() {
        // given
        val sut = PalindromeNumber()
        // when
        val result1 = sut.solution(121)
        val result2 = sut.solution(-121)
        val result3 = sut.solution(10)
        // then
        assertTrue(result1)
        assertFalse(result2)
        assertFalse(result3)
    }
}