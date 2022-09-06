/**
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.
**/

//Initialise an empty dummy node which will act like a start
// while list1 and list2 are not null, check the list whose val is lesser and add to the dummy node.return head.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode head = dummy;
        
        while(list1 != null && list2 != null){
            if(list1.val > list2.val){
                dummy.next = list2;
                list2 = list2.next;
            }
            else{
                dummy.next = list1;
                list1 = list1.next;
            }
            dummy = dummy.next;
            
            if(list1 != null){
                dummy.next = list1;
            }
            else{
                dummy.next = list2;
            }
            
        }
        return head.next;
        
    }
}
