/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        int size1 = 1;
        ListNode temp2 = headB;
        int size2 = 1;
        while(temp1!=null){
            size1++;
            temp1 = temp1.next;
        }
        while(temp2!=null){
            size2++;
            temp2 = temp2.next;
        }
        temp1 = headA;
        temp2 = headB;
        if(size1>size2){
            for(int i = 1 ; i <= size1-size2;i++){
                temp1 = temp1.next;
            }
        }
        if(size2>size1){
            for(int i = 1 ; i <= size2-size1;i++){
                temp2 = temp2.next;
            }
        }
        while(temp1!=temp2){ // ye ya to common node par true hoga ya null par
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }
}