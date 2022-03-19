# Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

# The first node is considered odd, and the second node is even, and so on.

# Note that the relative order inside both the even and odd groups should remain as it was in the input.


class Solution:
    def oddEvenList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        evenStart=None
        evenEnd=None
        oddStart=None
        oddEnd=None
        length=0
        temp=head
        while(temp!=None):
            length+=1
            if length%2==0:
                if evenStart==None:
                    evenStart=temp
                    evenEnd=temp
                else:
                    evenEnd.next=temp
                    evenEnd=temp
            else:
                if oddStart==None:
                    oddStart=temp
                    oddEnd=temp
                else:
                    oddEnd.next=temp
                    oddEnd=temp
            temp=temp.next
        if oddEnd!=None:
            oddEnd.next=evenStart
        if evenEnd!=None:
            evenEnd.next=None        
        return oddStart