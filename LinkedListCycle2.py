# Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        l=[]
        temp=head
        while temp:
            if temp not in l:
                l.append(temp)
            elif temp in l:
                return temp
            temp=temp.next