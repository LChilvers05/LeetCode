package LeetCode

import kotlin.test.Test
import kotlin.test.assertEquals

final class SimplifyPathTest {
    
    @Test fun testSolution() {
        // given
        val sut = SimplifyPath()
        // when
        val result1 = sut.solution("/home/")
        val result2 = sut.solution("/home/user/Documents/../Pictures")
        val result3 = sut.solution("/.../a/../b/c/../d/./")
        // then
        assertEquals("/home", result1)
        assertEquals("/home/user/Pictures", result2)
        assertEquals("/.../b/d", result3)
    }
}