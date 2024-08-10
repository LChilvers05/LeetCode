package LeetCode

import kotlin.test.Test
import kotlin.test.assertEquals

final class GroupAnagramsTest {
    
    @Test fun testSolution() {
        // given
        val sut = GroupAnagrams()
        // when
        val result1 = sut.solution(arrayOf("eat", "tea", "tan", "ate", "nat", "bat"))
        val result2 = sut.solution(arrayOf(""))
        val result3 = sut.solution(arrayOf("a"))
        // then
        assertEquals(listOf(
                listOf("eat","tea","ate"),
                listOf("tan","nat"),
                listOf("bat")
            ), 
            result1
        )
        assertEquals(listOf(listOf("")), result2)
        assertEquals(listOf(listOf("a")), result3)
    }
}