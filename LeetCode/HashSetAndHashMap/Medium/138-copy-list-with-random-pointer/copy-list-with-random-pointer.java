/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    // M1 -> Using HashMap
    public Node copyRandomList(Node head) {
        Node temp = head;
        Node dummy = new Node(-1);
        Node newTemp = dummy;
        HashMap<Node,Node> map = new HashMap<>();
        while(temp!=null){
            newTemp.next = new Node(temp.val);
            newTemp = newTemp.next;
            temp=temp.next;
        }
        temp = head;
        newTemp = dummy.next;
        while(temp!=null && newTemp!=null){
            map.put(temp,newTemp);
            temp = temp.next;
            newTemp = newTemp.next;
        }
        temp = head;
        newTemp = dummy.next;
        while(temp!=null && newTemp!=null){
            if(map.containsKey(temp.random)){
                newTemp.random = map.get(temp.random);
            }
            temp = temp.next;
            newTemp = newTemp.next;
        }
        return dummy.next;
    }
}