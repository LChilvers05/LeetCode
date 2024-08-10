// https://leetcode.com/problems/group-anagrams/?envType=study-plan-v2&envId=top-interview-150

package LeetCode

final class GroupAnagrams {

    fun solution(strs: Array<String>): List<List<String>> {
        
        var map = mutableMapOf<String, MutableList<String>>()

        for (i in strs.indices) {
            val key = strs[i].toCharArray().sorted().joinToString("")
            if (map[key] == null) map[key] = mutableListOf<String>()
            map[key]?.add(strs[i])
        }

        return map.values.toList()
    }
}