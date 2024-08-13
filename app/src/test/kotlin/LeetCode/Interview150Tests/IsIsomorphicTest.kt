package LeetCode

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlin.test.assertFalse

final class IsIsomorphicTest {

    @Test fun testSolution() {
        // given
        val sut = IsIsomorphic()
        // when
        val result1 = sut.solution("hello", "yoppa")
        val result2 = sut.solution("egg", "add")
        val result3 = sut.solution("badc", "baba")
        val result4 = sut.solution("hi", "hh")
        // then
        assertTrue(result1)
        assertTrue(result2)
        assertFalse(result3)
        assertFalse(result4)
    }
}