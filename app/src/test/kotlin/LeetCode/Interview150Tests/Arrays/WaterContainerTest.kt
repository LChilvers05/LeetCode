package LeetCode

import kotlin.test.Test
import kotlin.test.assertEquals

final class WaterContainerTest {
    
    @Test fun testSolution() {
        // given
        val sut = WaterContainer()
        // when
        val result1 = sut.solution(intArrayOf(1,8,6,2,5,4,8,3,7))
        val result2 = sut.solution(intArrayOf(1,1))
        val result3 = sut.solution(intArrayOf(1,899,99,5,4,8,3,7))
        val result4 = sut.solution(intArrayOf(1,1,1,1,1,1))
        val result5 = sut.solution(intArrayOf(1,0))
        // then
        assertEquals(49, result1)
        assertEquals(1, result2)
        assertEquals(99, result3)
        assertEquals(5, result4)
        assertEquals(0, result5)
    }
}