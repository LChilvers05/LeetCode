// https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
package LeetCode

 class PhoneNumberCombinations {

    private val keypad = mapOf(
        '2' to listOf('a', 'b', 'c'),
        '3' to listOf('d', 'e', 'f'),
        '4' to listOf('g', 'h', 'i'),
        '5' to listOf('j', 'k', 'l'),
        '6' to listOf('m', 'n', 'o'),
        '7' to listOf('p', 'q', 'r', 's'),
        '8' to listOf('t', 'u', 'v'),
        '9' to listOf('w', 'x', 'y', 'z')
    )

    fun solution(digits: String): List<String> {
        if (digits.isEmpty()) return listOf()

        var x = 1
        digits.forEach { x *= keypad[it]?.size ?: 0 }
        val result = MutableList(x) { "" }
        var rotator = 1
        
        for (digit in digits.reversed()) {
            val letters = keypad[digit] ?: continue

            var ptr = 0
            var count = 0
            for (i in result.indices) {
                result[i] = letters[ptr] + result[i] 

                count++
                if (count == rotator) {
                    ptr = (ptr + 1) % letters.size
                    count = 0
                }
            }

            rotator *= letters.size
        }

        return result
    }
}