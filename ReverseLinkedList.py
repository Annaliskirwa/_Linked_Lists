# Given the head of a singly linked list, reverse the list, and return the reversed list.


from typing import Optional


class Solution:
    def reverseList(self, head)->Optional[ListNode]:
        prev = None

        while head:
            curr = head
            head = head.next
            curr.next = prev
            prev = curr
        return prev