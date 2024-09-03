package LeetCode

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun areListsEqual(list1: ListNode?, list2: ListNode?): Boolean {
    var current1 = list1
    var current2 = list2
    
    while (current1 != null && current2 != null) {
        if (current1.`val` != current2.`val`) {
            return false
        }
        current1 = current1.next
        current2 = current2.next
    }
    
    return current1 == null && current2 == null
}

fun createLinkedList(arr: IntArray): ListNode? {
    if (arr.isEmpty()) return null
    
    val head = ListNode(arr[0])
    var current = head
    
    for (i in 1 until arr.size) {
        current.next = ListNode(arr[i])
        current = current.next!!
    }
    
    return head
}
