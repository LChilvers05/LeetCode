package LeetCode

import kotlin.test.Test
import kotlin.test.assertTrue

final class ProductOfArrayExceptSelfTest {
    
    @Test fun testSolution() {
        // given
        val sut = ProductOfArrayExceptSelf()
        // when
        val result1 = sut.solution(intArrayOf(1, 2, 3, 4))
        val result2 = sut.solution(intArrayOf(-1, 1, 0, -3, 3))
        // then
        assertTrue(intArrayOf(24, 12, 8, 6).contentEquals(result1))
        assertTrue(intArrayOf(0, 0, 9, 0, 0).contentEquals(result2))
    }
}