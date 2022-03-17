# Given the head of a linked list, remove the nth node from the end of the list and return its head.
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        fast_node, slow_node = head, head
        count = 0
        while fast_node.next is not None:
                
            fast_node = fast_node.next
            count += 1

            if count == n:
                slow_node = head
            elif count > n:
                slow_node = slow_node.next
                
        if count < n:
            head = head.next
            return head
        else:
            slow_node.next = slow_node.next.next  
        return head
        