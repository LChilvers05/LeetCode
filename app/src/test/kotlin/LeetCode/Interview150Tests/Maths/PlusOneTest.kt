package LeetCode

import kotlin.test.Test
import kotlin.test.assertTrue

final class PlusOneTest {
    
    @Test fun testSolution() {
        // given
        val sut = PlusOne()
        // when
        val result1 = sut.solution(intArrayOf(1, 2, 3))
        val result2 = sut.solution(intArrayOf(4, 3, 2, 1))
        val result3 = sut.solution(intArrayOf(9))
        val result4 = sut.solution(intArrayOf(1, 0, 9, 9, 9))

        // then
        assertTrue(intArrayOf(1, 2, 4).contentEquals(result1))
        assertTrue(intArrayOf(4, 3, 2, 2).contentEquals(result2))
        assertTrue(intArrayOf(1, 0).contentEquals(result3))
        assertTrue(intArrayOf(1, 1, 0, 0, 0).contentEquals(result4))
    }
}