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
    public ListNode reverseKGroup(ListNode head, int k) {
        // Count k nodes first
        ListNode temp = head;
        int count = 0;
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }
        // If there are less than k nodes, don't reverse
        if (count < k) {
            return head;
        }
        // Reverse first k nodes
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        count = 0;
        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

            count++;
        }
        // Recursively reverse the remaining list
        head.next = reverseKGroup(current, k);
        return prev;
    }
}