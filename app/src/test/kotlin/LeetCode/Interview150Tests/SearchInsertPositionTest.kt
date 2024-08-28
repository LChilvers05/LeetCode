package LeetCode

import kotlin.test.Test
import kotlin.test.assertEquals

final class SearchInsertPositionTest {
    
    @Test fun testSolution() {
        // given
        val sut = SearchInsertPosition()
        // when
        val result1 = sut.solution(intArrayOf(1, 3, 5, 6), 5)
        val result2 = sut.solution(intArrayOf(1, 3, 5, 6), 2)
        val result3 = sut.solution(intArrayOf(1, 3, 5, 6), 7)
        val result4 = sut.solution(intArrayOf(0), 5)
        val result5 = sut.solution(intArrayOf(6), 5)
        val result6 = sut.solution(intArrayOf(3, 5, 6), 5)

        // then
        assertEquals(2, result1)
        assertEquals(1, result2)
        assertEquals(4, result3)
        assertEquals(1, result4)
        assertEquals(0, result5)
        assertEquals(1, result6)
    }
}