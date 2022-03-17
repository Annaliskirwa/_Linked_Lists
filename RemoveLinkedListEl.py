# Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

class Solution:
    def removeElements(self, head: Optional[ListNode], val: int) -> Optional[ListNode]:
        
        if not head:
            return None
        if head.val == val:
            head = self.removeElements(head.next, val)
            
        else:
            head.next = self.removeElements(head.next, val)
                
        return head
    
     
            