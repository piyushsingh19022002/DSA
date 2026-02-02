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
        ListNode temp = head;
        ArrayList<Integer> data = new ArrayList<>();
        while(temp!=null){
            data.add(temp.val);
            temp = temp.next;
        }
        temp = head;
        for(int i = 1 ; i <data.size();i++){
            if(i%2==0){
                temp.next = new ListNode(data.get(i));
                temp = temp.next;
            }
        }
        for(int i = 1 ; i <data.size();i++){
            if(i%2!=0){
                temp.next = new ListNode(data.get(i));
                temp = temp.next;
            }
        }
        return head;
    }
}