# Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:
        p1 = headA
        p2 = headB
        
        len1 = 0
        len2 = 0
        while p1 is not None:
            len1 += 1
            p1 = p1.next
        
        while p2 is not None:
            len2 += 1
            p2 = p2.next
        
        p1 = headA
        p2 = headB
        
        if len1 > len2:
            diff = len1 - len2
            for i in range(diff):
                p1 = p1.next
        else:
            diff = len2 - len1
            for i in range(diff):
                p2 = p2.next
        while p1 != p2:
            p1 = p1.next
            p2 = p2.next
        return p1
        