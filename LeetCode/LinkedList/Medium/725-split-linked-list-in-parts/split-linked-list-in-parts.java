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
    public ListNode[] splitListToParts(ListNode head, int k) {
        // ListNode[] result = new ListNode[k];


        // int n = 0;
        // ListNode temp = head;
        // while (temp != null) {
        //     n++;
        //     temp = temp.next;
        // }

        // int size = n / k;
        // int extra = n % k;

        // ListNode curr = head;


        // for (int i = 0; i < k; i++) {

        //     if (curr == null) {
        //         result[i] = null;
        //         continue;
        //     }

        //     result[i] = curr;
        //     int partSize = size + (extra > 0 ? 1 : 0);
        //     extra--;


        //     for (int j = 1; j < partSize; j++) {
        //         curr = curr.next;
        //     }


        //     ListNode next = curr.next;
        //     curr.next = null;
        //     curr = next;
        // }

        // return result;
        ListNode[] ans = new ListNode[k];
        ListNode temp = head;
        int len = 0;
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        int size = len/k;
        int extra = len % k;
        temp = head;
        for(int i = 0 ; i < k; i++){
            if(temp==null){
                ans[i] = null;
                continue;
            }
            ans[i] = temp;
            int csize = extra>0?size+1:size;
            extra--;
            for(int j = 1 ; j <csize ;j++){
                temp = temp.next;
            }
            ListNode next = temp.next;
            temp.next = null;
            temp = next;
        }
        return ans;
    }
}