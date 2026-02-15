/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null) return 0; // agar end me h to kuch add nhi karna h
        // agar range me h dono side call jayegi
        if(root.val>=low && root.val<=high){
            return root.val + rangeSumBST(root.left,low,high) + rangeSumBST(root.right,low,high);
        }
        // agar root chota h right side me dekho
        if(root.val<low) return rangeSumBST(root.right,low,high);
        else return rangeSumBST(root.left,low,high);
        
    }
}