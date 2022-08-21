/**
Given the head of a singly linked list, reverse the list, and return the reversed list.
**/

// while head is not none, change the next pointers to prev

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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr;
        while(head!=null){
           curr = head;
            head = head.next;
            curr.next = prev;
            prev = curr;
        }
        return prev;
    }
}
