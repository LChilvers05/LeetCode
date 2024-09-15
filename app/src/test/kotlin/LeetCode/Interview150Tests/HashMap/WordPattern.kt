package LeetCode

import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertFalse

final class WordPatternTest {
    
    @Test fun testSolution() {
        // given
        val sut = WordPattern()
        // when
        val result1 = sut.solution("abba", "dog cat cat dog")
        val result2 = sut.solution("abba", "dog cat cat fish")
        val result3 = sut.solution("aaaa", "dog cat cat dog")
        val result4 = sut.solution("abba", "dog dog dog dog")
        // then
        assertTrue(result1)
        assertFalse(result2)
        assertFalse(result3)
        assertFalse(result4)
    }
}