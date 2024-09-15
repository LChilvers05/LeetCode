package LeetCode

import kotlin.test.Test
import kotlin.test.assertEquals

final class SummaryRangeTest {
    
    @Test fun testSolution() {
        // given
        val sut = SummaryRange()
        // when
        val result1 = sut.solution(intArrayOf(0, 1, 2, 4, 5, 7))
        val result2 = sut.solution(intArrayOf(0, 2, 3, 4, 6, 8, 9))
        val result3 = sut.solution(intArrayOf(1, 3, 5, 7))
        val result4 = sut.solution(intArrayOf())

        // then
        assertEquals(listOf("0->2", "4->5", "7"), result1)
        assertEquals(listOf("0", "2->4", "6", "8->9"), result2)
        assertEquals(listOf("1", "3", "5", "7"), result3)
        assertEquals(emptyList(), result4)
    }
}