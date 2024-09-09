package LeetCode

import kotlin.test.Test
import kotlin.test.assertEquals

final class ZigZagConversionTest {
    
    @Test fun testSolution() {
        // given
        val sut = ZigZagConversion()
        // when
        val result1 = sut.solution("PAYPALISHIRING", 3)
        val result2 = sut.solution("A", 1)
        val result3 = sut.solution("abcdefghijklmnopqrstuvwxyz", 8)
        // then
        assertEquals("PAHNAPLSIIGYIR", result1)
        assertEquals("A", result2)
        assertEquals("aobnpcmqdlrzeksyfjtxgiuwhv", result3)
    }
}