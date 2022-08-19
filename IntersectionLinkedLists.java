/**
Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. 
If the two linked lists have no intersection at all, return null.
**/

//Approach is to find the difference in length to the intersection then find the intersection where the listnodeA == listNodeB

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;
        
        int len1 = 0;
        int len2 = 0;
        
        int diff;
        
        while(p1 != null){
            len1 += 1;
            p1 = p1.next;
        }
        while(p2 != null){
            len2 += 1;
            p2 = p2.next;
        }
        p1 = headA;
        p2 = headB;
        
            
        if (len1 > len2){
            diff = len1 - len2;
            for(int i = 0; i< diff; i++){
                p1 = p1.next;
            }
        }
        else{
            diff = len2 - len1;
            for(int i = 0; i<diff; i++){
                p2 = p2.next;
            }
        }
        while(p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}
