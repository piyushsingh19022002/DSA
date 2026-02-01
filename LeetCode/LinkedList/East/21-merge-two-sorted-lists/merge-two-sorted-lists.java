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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // if(list1==null) return list2;
        // if(list2==null) return list1;
        // ListNode i = list1;
        // ListNode j = list2;
        // ListNode head = new ListNode(0,null);
        // ListNode temp = head;
        // while(i!=null && j!=null){
        //     if(i.val>=j.val){
        //         temp.next = new ListNode(j.val);
        //         j = j.next;
        //     }else{
        //         temp.next = new ListNode(i.val);
        //         i = i.next;
        //     }
        //     temp = temp.next;
        // }
        // while(i!=null){
        //     temp.next = new ListNode(i.val,null);
        //     i = i.next;
        //     temp = temp.next;
        // }
        // while(j!=null){
        //     temp.next = new ListNode(j.val,null);
        //     j = j.next;
        //     temp = temp.next;
        // }
        // return head.next;
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;
        while(list1!=null && list2!=null){
            if(list1.val>=list2.val){
                temp.next = list2;
                list2 = list2.next;
            }else{
                temp.next = list1;
                list1 = list1.next;
            }
            temp = temp.next;
        }
        if(list1==null) temp.next = list2;
        else if(list2==null) temp.next = list1;
        return ans.next;
    }
}