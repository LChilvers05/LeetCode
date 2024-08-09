package LeetCode

final class IndexOfFirstOccurence {

    fun solution(haystack: String, needle: String): Int {
        if (haystack == needle) return 0

        var index = -1
        for (i in haystack.indices) {
            var j = minOf(haystack.length, i + needle.length)

            val s = if (needle.length == 1) 
                    haystack[i].toString() else 
                    haystack.substring(i, j)

            if (s != needle) continue
            index = i
            break
        }

        return index
    }
}