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
    public ListNode middleNode(ListNode head) {
        // ListNode temp = head;
        // int size = 0;
        // while(temp!=null){
        //     size++;
        //     temp = temp.next;
        // }
        // ListNode x = head;
        // int mid = size/2;
        // for(int i = 1 ; i <= mid ; i++){
        //     x = x.next;
        // }
        // return x;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}