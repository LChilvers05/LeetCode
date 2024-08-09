package LeetCode

import kotlin.test.Test
import kotlin.test.assertEquals

final class IndexOfFirstOccurenceTest {
    
    @Test fun testSolution() {
        // given
        val sut = IndexOfFirstOccurence()
        // when
        val result1 = sut.solution("mississippi", "pi")
        val result2 = sut.solution("leetcode", "leeto")
        val result3 = sut.solution("a", "a")
        // then
        assertEquals(9, result1)
        assertEquals(-1, result2)
        assertEquals(0, result3)
    }
}