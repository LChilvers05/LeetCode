package LeetCode

import kotlin.test.Test
import kotlin.test.assertEquals

final class PhoneNumberCombinationsTest {

    @Test fun testSolution() {
        // given
        val sut = PhoneNumberCombinations()
        // when
        val result1 = sut.solution("23")
        val result2 = sut.solution("")
        val result3 = sut.solution("2")
        // then
        assertEquals(listOf("ad","ae","af","bd","be","bf","cd","ce","cf"), result1)
        assertEquals(listOf(), result2)
        assertEquals(listOf("a", "b", "c"), result3)
    }
}