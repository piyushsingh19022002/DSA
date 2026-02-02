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
    public ListNode insertionSortList(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> cpy = new ArrayList<>();
        while(temp!=null){
            cpy.add(temp.val);
            temp = temp.next;
        }
        for(int i = 1 ; i < cpy.size() ; i++){
            int key = cpy.get(i);
            int j = i - 1;
            while(j>=0 && cpy.get(j)>key){
                cpy.set(j+1,cpy.get(j));
                j--; 
            }
            cpy.set(j+1,key);
        }
        temp = head;
        int idx = 0;
        while(idx<cpy.size()){
            temp.next = new ListNode(cpy.get(idx));
            temp = temp.next;
            idx++;
        }
        return head.next;
    }
}