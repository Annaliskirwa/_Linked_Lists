# Given the head of a singly linked list, return true if it is a palindrome.

from threading import currentThread


class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        val = []
        current_node = head
        while current_node is not None:
            val.append(current_node.val)
            current_node = current_node.next

        return val == val[::-1]