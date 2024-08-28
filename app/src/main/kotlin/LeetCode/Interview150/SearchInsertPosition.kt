package LeetCode

final class SearchInsertPosition {
    fun solution(nums: IntArray, target: Int): Int {
        var l = 0
        var h = nums.lastIndex

        while (l <= h) {
            val m = l + ((h - l)/2)

            when {
                nums[m] == target -> return m
                nums[m] > target -> h = m-1
                else -> l = m+1
            }
        }

        return l
    }
}