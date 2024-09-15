package LeetCode

import kotlin.test.Test
import kotlin.test.assertEquals

final class EvaluateReversePolishNotationTest {
    
    @Test fun testSolution() {
        // given
        val sut = EvaluateReversePolishNotation()
        // when
        val result1 = sut.solution(arrayOf("2","1","+","3","*"))
        val result2 = sut.solution(arrayOf("4","13","5","/","+"))
        val result3 = sut.solution(arrayOf("10","6","9","3","+","-11","*","/","*","17","+","5","+"))

        // then
        assertEquals(9, result1)
        assertEquals(6, result2)
        assertEquals(22, result3)
    }
}