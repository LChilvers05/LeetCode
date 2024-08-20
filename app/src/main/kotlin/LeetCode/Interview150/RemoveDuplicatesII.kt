// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/submissions/1362331763/?envType=study-plan-v2&envId=top-interview-150

package LeetCode

final class RemoveDuplicatesII {

    fun solution(nums: IntArray): Int {
        if (nums.size <= 2) return nums.size

        var curr = nums[0]
        var count = 0
        var ptr = 0
        for (num in nums) {
            count = if (num == curr) count + 1 else 1
            curr = num

            nums[ptr] = num

            if (count <= 2) ptr++
        }

        return ptr
    }
}