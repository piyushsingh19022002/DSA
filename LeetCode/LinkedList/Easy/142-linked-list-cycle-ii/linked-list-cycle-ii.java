/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null; // if size=0 or size=1 of ll is not circular
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow) break;
        }
        if(slow!=fast) return null;
        while(temp!=slow){
            temp = temp.next;
            slow = slow.next;
        }
        return slow;
    }
}