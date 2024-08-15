package LeetCode

import kotlin.test.Test
import kotlin.test.assertEquals

final class SpiralMatrixTest {
    
    @Test fun testSolution() {
        // given
        val sut = SpiralMatrix()
        // when
        val result1 = sut.solution(arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9)
        ))
        val result2 = sut.solution(arrayOf(
            intArrayOf(1, 2, 3, 4),
            intArrayOf(5, 6, 7, 8),
            intArrayOf(9, 10, 11, 12)
        ))
        // then
        assertEquals(listOf(1,2,3,6,9,8,7,4,5), result1)
        assertEquals(listOf(1,2,3,4,8,12,11,10,9,5,6,7), result2)
    }
}