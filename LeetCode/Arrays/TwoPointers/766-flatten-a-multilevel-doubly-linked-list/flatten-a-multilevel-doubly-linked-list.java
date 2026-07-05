/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {

    public Node flatten(Node head) {

        // If the list is empty, return null
        if (head == null) {
            return null;
        }

        Stack<Node> stack = new Stack<>();
        Node current = head;

        while (current != null) {

            // If current node has a child
            if (current.child != null) {

                // Save the next node to process later
                if (current.next != null) {
                    stack.push(current.next);
                }

                // Connect current node with its child
                current.next = current.child;
                current.child.prev = current;

                // Remove child pointer after connecting
                current.child = null;
            }

            // If we reach the end of the current level
            if (current.next == null && !stack.isEmpty()) {

                // Continue with the previously saved node
                Node nextNode = stack.pop();

                current.next = nextNode;
                nextNode.prev = current;
            }

            // Move to the next node
            current = current.next;
        }

        return head;
    }
}