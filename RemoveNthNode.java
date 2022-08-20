/**
Given the head of a linked list, remove the nth node from the end of the list and return its head.
**/

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        int count = 0;
        while(fast.next != null){
            fast = fast.next;
            count += 1;
             if(count == n){
                 slow = head;
             }
            else if(count > n){
                slow = slow.next;
            }
        }
        if (count < n){
            head = head.next;
            return head;
        }else{
            slow.next = slow.next.next;
        }
        return head;
    }
}
