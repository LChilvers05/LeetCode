// https://leetcode.com/problems/summary-ranges/?envType=study-plan-v2&envId=top-interview-150
package LeetCode

final class SummaryRange {
    fun solution(nums: IntArray): List<String> {
        if (nums.isEmpty()) return emptyList()
        if (nums.size == 1) return listOf("${nums[0]}")

        val result = mutableListOf<String>()
        var sb = StringBuilder("${nums[0]}")
        var start = nums[0]
        var prev = start

        for (i in 1 until nums.size) {
            val num = nums[i]
            if (num == prev + 1) {
                prev = num
                continue
            }

            if (prev > start) sb.append("->$prev")
            result.add(sb.toString())
            sb = StringBuilder("$num")
            start = num
            prev = start
        }

        if (prev > start) sb.append("->$prev")
        result.add(sb.toString())

        return result;
    }
}