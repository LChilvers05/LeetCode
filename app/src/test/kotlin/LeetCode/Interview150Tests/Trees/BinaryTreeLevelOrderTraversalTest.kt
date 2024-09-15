package LeetCode

import kotlin.test.Test
import kotlin.test.assertTrue

final class BinaryTreeLevelOrderTraversalTest {
    @Test fun testSolution() {
        // given
        val sut = BinaryTreeLevelOrderTraversal()
        val tree1 = createTree(arrayOf(3,9,20,null,null,15,7))
        val tree2 = createTree(arrayOf(1))
        val tree3 = createTree(arrayOf())
        // when
        val result1 = sut.solution(tree1)
        val result2 = sut.solution(tree2)
        val result3 = sut.solution(tree3)
        // then
        assertTrue(areListsEqual(
            listOf(
                listOf(3),
                listOf(9, 20),
                listOf(15, 7)
            ), 
            result1
        ))
        assertTrue(areListsEqual(
            listOf(listOf(1)), 
            result2
        ))
        assertTrue(areListsEqual(
            emptyList(), 
            result3
        ))
    }

    private fun areListsEqual(list1: List<List<Int>>, list2: List<List<Int>>): Boolean {
        return list1.size == list2.size && list1.zip(list2).all { (a, b) -> a == b }
    }
}