/**
Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

/**
Create two array lists: Loop through the linked list storing values in the arraylist: Copy the values to the second arraylist: reverse: check if both arraylists are equal.
*/


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
import java.util.*;
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode rev = head;
        ArrayList arr = new ArrayList();
        while(rev != null){
            arr.add(rev.val);
            rev = rev.next;
        }
        ArrayList arr1 = new ArrayList();
        arr1.addAll(arr);
        Collections.reverse(arr1);
        if (arr.equals(arr1)){
            return true;
        } else{
            return false;
        }
        
    }
}
