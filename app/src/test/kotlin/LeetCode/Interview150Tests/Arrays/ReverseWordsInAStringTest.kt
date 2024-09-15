package LeetCode

import kotlin.test.Test
import kotlin.test.assertEquals

final class ReverseWordsInAStringTest {
    
    @Test fun testSolution() {
        // given
        val sut = ReverseWordsInAString()
        // when
        val result1 = sut.solution("the sky is blue")
        val result2 = sut.solution("  hello world  ")
        val result3 = sut.solution("a good  example")
        // then
        assertEquals("blue is sky the", result1)
        assertEquals("world hello", result2)
        assertEquals("example good a", result3)
    }
}