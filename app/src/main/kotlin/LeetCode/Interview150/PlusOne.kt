package LeetCode

final class PlusOne {

    fun solution(digits: IntArray): IntArray {

        val result = digits.toMutableList()
        var i = digits.lastIndex

        while (i >= 0) {
            result[i]++

            if (result[i] > 9) {
                result[i] = 0
                i--
                if (i < 0) result.add(0, 1)
                continue
            }
            break
        }

        return result.toIntArray()
    }
}