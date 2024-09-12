package LeetCode

import kotlin.test.Test
import kotlin.test.assertTrue

final class RemoveNthFromEndTest {
    @Test fun testSolution() {
        // given
        val sut = RemoveNthFromEnd()

        val l1 = createLinkedList(intArrayOf(1, 2, 3, 4, 5))
        val l2 = createLinkedList(intArrayOf(1))
        val l3 = createLinkedList(intArrayOf(1,2))
        val l4 = createLinkedList(intArrayOf(1, 2, 3, 4, 5))
        val l5 = createLinkedList(intArrayOf(1, 2, 3, 4, 5))
        val l6 = createLinkedList(intArrayOf(1, 2, 3, 4, 5))

        val e1 = createLinkedList(intArrayOf(1, 2, 3, 5))
        val e2 = createLinkedList(intArrayOf())
        val e3 = createLinkedList(intArrayOf(1))
        val e4 = createLinkedList(intArrayOf(1, 2, 3, 4))
        val e5 = createLinkedList(intArrayOf(2, 3, 4, 5))
        val e6 = createLinkedList(intArrayOf(1, 2, 4, 5))
        // when
        val result1 = sut.solution(l1, 2)
        val result2 = sut.solution(l2, 1)
        val result3 = sut.solution(l3, 1)
        val result4 = sut.solution(l4, 1)
        val result5 = sut.solution(l5, 5)
        val result6 = sut.solution(l6, 3)
        // then
        assertTrue(areListsEqual(e1, result1))
        assertTrue(areListsEqual(e2, result2))
        assertTrue(areListsEqual(e3, result3))
        assertTrue(areListsEqual(e4, result4))
        assertTrue(areListsEqual(e5, result5))
        assertTrue(areListsEqual(e6, result6))
    }
}