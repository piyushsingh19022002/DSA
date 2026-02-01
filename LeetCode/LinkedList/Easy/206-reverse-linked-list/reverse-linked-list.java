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
        // if(head==null) return head;
        // ArrayList<Integer> reverse = new ArrayList<>();
        // ListNode temp = head;
        // while(temp!=null){
        //     reverse.add(temp.val);
        //     temp = temp.next;
        // }
        // temp = head;
        // for(int i = reverse.size()-1;i>=0;i--){
        //     temp.next = new ListNode(reverse.get(i));
        //     temp = temp.next;
        // }
        // return head.next;
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}