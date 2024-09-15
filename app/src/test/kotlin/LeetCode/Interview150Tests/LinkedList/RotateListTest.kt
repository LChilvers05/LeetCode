package LeetCode

import kotlin.test.Test
import kotlin.test.assertTrue

final class RotateListTest {
    
    @Test fun testSolution() {
        // given
        val sut = RotateList()

        val l1 = createLinkedList(intArrayOf(1, 2, 3, 4, 5))
        val l2 = createLinkedList(intArrayOf(0, 1, 2))
        val l3 = createLinkedList(intArrayOf(0))
        val l4 = createLinkedList(intArrayOf(0, 1, 2, 3, 4, 5))

        val expected1 = createLinkedList(intArrayOf(4, 5, 1, 2, 3))
        val expected2 = createLinkedList(intArrayOf(2, 0, 1))
        val expected3 = createLinkedList(intArrayOf(0))
        val expected4 = createLinkedList(intArrayOf(4, 5, 0, 1, 2, 3))
        // when
        val result1 = sut.solution(l1, 2)
        val result2 = sut.solution(l2, 4)
        val result3 = sut.solution(l3, 2)
        val result4 = sut.solution(l4, 20)

        // then
        assertTrue(areListsEqual(expected1, result1))
        assertTrue(areListsEqual(expected2, result2))
        assertTrue(areListsEqual(expected3, result3))
        assertTrue(areListsEqual(expected4, result4))
    }
}