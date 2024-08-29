package LeetCode

import kotlin.test.Test
import kotlin.test.assertTrue

final class TwoSumTest {
    
    @Test fun testSolution() {
        // given
        val sut = TwoSum()
        // when
        val result1 = sut.solution(intArrayOf(2, 7, 11, 15), 9)
        val result2 = sut.solution(intArrayOf(3, 2, 4), 6)
        val result3 = sut.solution(intArrayOf(3, 3), 6)
        val result4 = sut.solution(intArrayOf(0, 3, -3, 4, -1), -1)

        // then
        assertTrue(intArrayOf(0, 1).contentEquals(result1))
        assertTrue(intArrayOf(1, 2).contentEquals(result2))
        assertTrue(intArrayOf(0, 1).contentEquals(result3))
        assertTrue(intArrayOf(0, 4).contentEquals(result4))
    }
}