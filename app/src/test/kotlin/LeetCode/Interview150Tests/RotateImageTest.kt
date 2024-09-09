package LeetCode

import kotlin.test.Test
import kotlin.test.assertTrue

final class RotateImageTest {
    
    @Test fun testSolution() {
        // given
        val sut = RotateImage()
        // when
        val result1 = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9)
        )
        sut.solution(result1)
        val result2 = arrayOf(
            intArrayOf(5, 1, 9, 11),
            intArrayOf(2, 4, 8, 10),
            intArrayOf(13, 3, 6, 7),
            intArrayOf(15, 14, 12, 16)
        )
        sut.solution(result2)
        // then
        assertTrue(areMatricesEqual(arrayOf(
            intArrayOf(7, 4, 1),
            intArrayOf(8, 5, 2),
            intArrayOf(9, 6, 3)
        ), result1))
        assertTrue(areMatricesEqual(arrayOf(
            intArrayOf(15, 13, 2, 5),
            intArrayOf(14, 3, 4, 1),
            intArrayOf(12, 6, 8, 9),
            intArrayOf(16, 7, 10, 11)
        ), result2))
    }
}