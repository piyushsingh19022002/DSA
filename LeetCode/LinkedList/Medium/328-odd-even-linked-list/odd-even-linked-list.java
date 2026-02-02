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
    public ListNode oddEvenList(ListNode head) {
        // ListNode temp = head;
        // ArrayList<Integer> data = new ArrayList<>();
        // while(temp!=null){
        //     data.add(temp.val);
        //     temp = temp.next;
        // }
        // temp = head;
        // for(int i = 1 ; i <data.size();i++){
        //     if(i%2==0){
        //         temp.next = new ListNode(data.get(i));
        //         temp = temp.next;
        //     }
        // }
        // for(int i = 1 ; i <data.size();i++){
        //     if(i%2!=0){
        //         temp.next = new ListNode(data.get(i));
        //         temp = temp.next;
        //     }
        // }
        // return head;
        if(head==null || head.next==null) return head;
        ListNode oddDummy = new ListNode(-1);
        ListNode oddTemp = oddDummy;
        ListNode evenDummy = new ListNode(-1);
        ListNode evenTemp = evenDummy;
        ListNode temp = head;
        int idx = 0;
        while(temp!=null){
            if(idx%2==0){
                oddTemp.next = new ListNode(temp.val);
                oddTemp = oddTemp.next;
                idx++;
            }else{
                evenTemp.next = new ListNode(temp.val);
                evenTemp = evenTemp.next;
                idx++;
            }
            temp = temp.next;
        }
        oddTemp.next = evenDummy.next;
        return oddDummy.next;
    }
}