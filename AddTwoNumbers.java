/**
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
*/

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         initialize current node
        ListNode dummyHead = new ListNode(0);
//         initialize the dummy head of the returning list
        ListNode curr = dummyHead;
//         Initialize carry to 0
        int carry = 0;
//         loop through l1 and l2 until both ends are reached and carry is 0
        while(l1 != null || l2 != null || carry != 0){
//             set x to l1 node's value. If no value set to 0
            int x = (l1 != null) ? l1.val : 0;
//             set y to l2 node's value. If no value set to 0
            int y = (l2 != null) ? l2.val : 0;
//             set sum as x + y + carry
            int sum = x + y + carry;
//             update carry as sum/10
            carry = sum/10;
//             Create a new node of sum mod 10 and set the current node's next
            curr.next = new ListNode(sum % 10);
//              advance current node to next
                curr = curr.next;
//              advance l1
                  if (l1 != null)
                      l1 = l1.next;
//              advance l2
                if (l2 != null)
                    l2 = l2.next;
//             Return dummy head's next node.
                
        }
        return dummyHead.next;
    }
}
