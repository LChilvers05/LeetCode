// https://leetcode.com/problems/product-of-array-except-self/?envType=study-plan-v2&envId=top-interview-150

package LeetCode

final class ProductOfArrayExceptSelf {

    fun solution(nums: IntArray): IntArray {
        val result = IntArray(nums.size) { 1 }

        var prefix = 1
        var suffix = 1

        var j = nums.lastIndex
        for (i in nums.indices) {
            result[i] *= prefix
            result[j] *= suffix

            suffix *= nums[j]
            prefix *= nums[i]
            j -= 1
        }

        return result
    }
}