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
    public int level(TreeNode root){
        if(root==null) return 0;
        return 1 + Math.max(level(root.left),level(root.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int currDia = level(root.left) + level(root.right) + 1 - 1; // h = l - 1;
        int leftDia = diameterOfBinaryTree(root.left); 
        int rightDia = diameterOfBinaryTree(root.right);
        return Math.max(currDia,Math.max(leftDia,rightDia));
    }
}