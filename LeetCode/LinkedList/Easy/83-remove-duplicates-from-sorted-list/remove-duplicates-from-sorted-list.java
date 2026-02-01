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
    public ListNode deleteDuplicates(ListNode head) {
        // ListNode temp = head;
        // while(temp!=null && temp.next!=null){
        //     if(temp.val==temp.next.val){
        //         temp.next = temp.next.next;
        //     }
        //     else temp = temp.next;
        // }
        // return head;
        if(head==null || head.next==null) return head;
        ListNode i = head;
        ListNode j = head.next;
        while(i!=null && j!=null){
            if(i.val==j.val){
                j = j.next;
                i.next = j;
            }else{
                i = i.next;
                j = j.next;
            }
        }
        return head;
    }
}