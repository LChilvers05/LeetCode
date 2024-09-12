// https://leetcode.com/problems/remove-nth-node-from-end-of-list/submissions/1388010505/?envType=study-plan-v2&envId=top-interview-150
package LeetCode

final class RemoveNthFromEnd {
    fun solution(head: ListNode?, n: Int): ListNode? {
        if (head?.next == null) return null
        var h = head

        var flag = false
        var count = 1

        var prev: ListNode? = null
        var tbr = h
        var curr = h

        while (curr?.next != null) {
            if (count == n) flag = true
            curr = curr.next

            if (flag) {
                prev = tbr
                tbr = tbr?.next
                continue
            }

            count++
        }
        if (flag) {
            prev?.next = tbr?.next
        } else {
            h = h.next
        }

        return h
    }
}