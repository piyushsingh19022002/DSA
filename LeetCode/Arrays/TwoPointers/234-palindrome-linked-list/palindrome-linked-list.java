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
    public boolean isPalindrome(ListNode head) {
        // Using Stack
        // boolean flag = true;
        // Stack<Integer> st = new Stack<>();
        // ListNode temp = head;
        // while(temp!=null){
        //     st.push(temp.val);
        //     temp = temp.next;
        // }
        // temp = head;
        // while(!st.isEmpty()){
        //     if(temp.val!=st.pop()){
        //         flag = false;
        //         break;
        //     }else{
        //         temp = temp.next;
        //     }
        // }
        // return flag;


        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode curr = slow;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode i = head;
        ListNode j = prev;
        while(j!=null){
            if(i.val!=j.val) return false;
            i = i.next;
            j = j.next;
        }
        return true;
        // ArrayList cpy = new ArrayList<>();
        // ListNode temp = head;
        // while(temp!=null){
        //     cpy.add(temp.val);
        //     temp = temp.next;
        // }
        // int i = 0 , j = cpy.size()-1;
        // while(i<=j){
        //     if(cpy.get(i)!=cpy.get(j))return false;
        //     else{
        //         i++;
        //         j--;
        //     }
        // }
        // return true;
    //     if(head.next==null) return true;
    //     ListNode temp = head.next;
    //     ListNode newHead = new ListNode(head.val);
    //     ListNode x = newHead;
    //     while(temp!=null){
    //         x.next = new ListNode(temp.val);
    //         x = x.next;
    //         temp = temp.next;
    //     }
    //     ListNode prev = null;
    //     ListNode curr = newHead;
    //     while(curr!=null){
    //         ListNode next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }
    //     x = prev; // reverse karne ke baad prev hi head hota h reversed LL ka
    //     temp = head;
    //     while(x!=null){
    //         if(x.val!=temp.val) return false;
    //         x = x.next;
    //         temp = temp.next;
    //     }
    //     return true;
    }
}