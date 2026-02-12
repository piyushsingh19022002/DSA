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
// class Solution {
//     public int level(TreeNode root){
//         if(root==null) return 0;
//         return 1 + Math.max(level(root.left),level(root.right));
//     }
//     public int diameterOfBinaryTree(TreeNode root) {
//         if(root==null) return 0;
//         int currDia = level(root.left) + level(root.right) + 1 - 1; // h = l - 1;
//         int leftDia = diameterOfBinaryTree(root.left); 
//         int rightDia = diameterOfBinaryTree(root.right);
//         return Math.max(currDia,Math.max(leftDia,rightDia));
//     }
// }
class Solution {
    public int level(TreeNode root,int[] ans){
        if(root==null) return 0;
        int rightLevel = level(root.right,ans);
        int leftLevel = level(root.left,ans);
        int currDia = rightLevel + leftLevel + 1 - 1;
        ans[0] = Math.max(ans[0],currDia);
        return 1 + Math.max(rightLevel,leftLevel);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int[] ans = {0};
        level(root,ans);
        return ans[0];
    }
}