package LeetCode

import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertFalse

final class HappyNumberTest {
    
    @Test fun testSolution() {
        // given
        val sut = HappyNumber()
        // when
        val result1 = sut.solution(19)
        val result2 = sut.solution(2)
        // then
        assertTrue(result1)
        assertFalse(result2)
    }
}