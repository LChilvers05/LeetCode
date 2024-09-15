package LeetCode

import kotlin.test.Test
import kotlin.test.assertTrue

final class FlattenBinaryTreeToLinkedListTest {
    
    @Test fun testSolution() {
        // given
        val sut = FlattenBinaryTreeToLinkedList()
        val tree1 = createTree(arrayOf(1,2,5,3,4,null,6))
        val tree2 = createTree(arrayOf())
        val tree3 = createTree(arrayOf(0))
        val tree4 = createTree(arrayOf(1,2,5,3,4,null,6,8,9,null,11,12,null,null,8,null,8))
        // when
        val result1 = sut.solution(tree1)
        val result2 = sut.solution(tree2)
        val result3 = sut.solution(tree3)
        val result4 = sut.solution(tree4)
        // then
        val expected1 = createTree(arrayOf(1,null,2,null,3,null,4,null,5,null,6))
        val expected2 = createTree(arrayOf())
        val expected3 = createTree(arrayOf(0))
        val expected4 = createTree(arrayOf(1,null,2,null,3,null,8,null,8,null,9,null,8,null,4,null,11,null,5,null,6,null,12))

        assertTrue(areTreesEqual(expected1, result1))
        assertTrue(areTreesEqual(expected2, result2))
        assertTrue(areTreesEqual(expected3, result3))
        assertTrue(areTreesEqual(expected4, result4))
    }
}