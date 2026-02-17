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
    public long max(TreeNode root){
        if(root==null) return Long.MIN_VALUE;
        long left = max(root.left);
        long right = max(root.right);
        return Math.max(root.val,Math.max(left,right));
    }
    public long min(TreeNode root){
        if(root==null) return Long.MAX_VALUE;
        long left = min(root.left);
        long right = min(root.right);
        return Math.min(root.val,Math.min(left,right));
    }
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        if(root.val<=max(root.left)) return false;
        if(root.val>=min(root.right)) return false;
        return isValidBST(root.left) && isValidBST(root.right);
    }
}