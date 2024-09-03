package LeetCode

final class RotateList {
    fun solution(head: ListNode?, k: Int): ListNode? {
        if (head == null || head.next == null) return head

        var len = 1
        // make loop
        var curr = head
        while (curr?.next != null) {
            curr = curr.next
            len++
        }
        curr?.next = head
        // rotations required
        val r = k % len

        var count = 1
        curr = head
        // traverse loop
        while (count < len-r) {
            curr = curr?.next
            count++
        }

        val result = curr?.next
        curr?.next = null

        return result
    }
}