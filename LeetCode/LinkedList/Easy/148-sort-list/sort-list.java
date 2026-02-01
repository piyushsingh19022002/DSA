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
    public ListNode merge(ListNode h1,ListNode h2){
        ListNode dummy = new ListNode(-1);
        ListNode k = dummy;
        ListNode i = h1;
        ListNode j = h2;
        while(i!=null && j!=null){
            if(i.val>=j.val){
                k.next = j;
                j = j.next;
            }else{
                k.next = i;
                i = i.next;
            }
            k = k.next;
        }
        if(i==null) k.next = j;
        else k.next = i;
        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode firstHalf = head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){ // even size wale case me left mid
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalf = slow.next;
        slow.next = null;
        firstHalf = sortList(firstHalf);
        secondHalf = sortList(secondHalf);
        return merge(firstHalf,secondHalf);
    }
}