package LeetCode

final class WordPattern {

    fun solution(pattern: String, string: String): Boolean {
        val str = string.split(' ')
        if (pattern.length != str.size) return false

        val p_s = mutableMapOf<Char, String>()
        val s_p = mutableMapOf<String, Char>()

        var result = true

        for (i in str.indices) {
            val s = str[i]
            val p = pattern[i]

            if ((p_s.containsKey(p) && p_s[p] != s) ||
                (s_p.containsKey(s) && s_p[s] != p)) {
                result = false
                break
            }

            p_s[p] = s
            s_p[s] = p
        }

        return result
    }
}