// https://leetcode.com/problems/two-sum/?envType=study-plan-v2&envId=top-interview-150
package LeetCode

final class TwoSum {

    fun solution(nums: IntArray, target: Int): IntArray {
        var result: IntArray? = null
        val map = mutableMapOf<Int, MutableList<Int>>()

        for ((i, num) in nums.withIndex()) {
            map.getOrPut(num) { mutableListOf() }.add(i)

            result = checkMap(map, i, num, target)
            if (result != null) break
        }

        if (result == null) {
            for ((i, num) in nums.withIndex()) {
                result = checkMap(map, i, num, target)
                if (result != null) break
            }
        }

        return result!!
    }

    private fun checkMap(
        map: MutableMap<Int, MutableList<Int>>,
        index: Int,
        num: Int,
        target: Int
    ): IntArray? {
        if (!map.containsKey(target-num) || 
        (num == target / 2 && map[target-num]!!.size != 2)) return null

        val result: MutableList<Int> = map[target-num]!!
        if (num != target / 2) result.add(index)

        return result.toIntArray()
    }
}