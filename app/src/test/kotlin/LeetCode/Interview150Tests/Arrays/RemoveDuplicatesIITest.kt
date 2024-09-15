package LeetCode

import kotlin.test.Test
import kotlin.test.assertTrue

final class RemoveDuplicatesIITest {

    @Test fun testSolution() {
        // given
        val sut = RemoveDuplicatesII()
        val test1 = intArrayOf(1, 1, 1, 2, 2, 3)
        val test2 = intArrayOf(0, 0, 1, 1, 1, 2, 3, 3)
        val test3 = intArrayOf(1)
        val test4 = intArrayOf(1, 2, 2)
        
        // when
        val index1 = sut.solution(test1)
        val result1 = test1.copyOfRange(0, index1)

        val index2 = sut.solution(test2)
        val result2 = test2.copyOfRange(0, index2)

        val index3 = sut.solution(test3)
        val result3 = test3.copyOfRange(0, index3)

        val index4 = sut.solution(test4)
        val result4 = test4.copyOfRange(0, index4)

        // then
        assertTrue(intArrayOf(1, 1, 2, 2, 3).contentEquals(result1))
        assertTrue(intArrayOf(0, 0, 1, 1, 2, 3, 3).contentEquals(result2))
        assertTrue(intArrayOf(1).contentEquals(result3))
        assertTrue(intArrayOf(1, 2, 2).contentEquals(result4))
    }
}
