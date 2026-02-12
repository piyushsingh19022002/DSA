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
 // wrong
// class Solution {
//     public int levels(TreeNode root){
//         if(root==null) return 0;
//         return 1 + Math.max(levels(root.left),levels(root.right));
//     }
//     public void dfs(TreeNode root,boolean ans){
//         if(root==null) return;
//         if(Math.abs(levels(root.left)-levels(root.right))>1){
//             ans = false;
//             return;
//         }
//         dfs(root.left,ans);
//         dfs(root.right,ans);
//     }
//     public boolean isBalanced(TreeNode root) {
//         boolean ans = true;
//         dfs(root,ans);
//         return ans;
//     }
// }
// class Solution {
//     public int levels(TreeNode root){
//         if(root==null) return 0;
//         return 1 + Math.max(levels(root.left),levels(root.right));
//     }
//     public boolean isBalanced(TreeNode root) {
//         if(root==null) return true;
//         int diff = Math.abs(levels(root.left)-levels(root.right));
//         if(diff>1) return false;
//         return isBalanced(root.left) && isBalanced(root.right);
//     }
// }
class Solution {
    public int levels(TreeNode root,boolean[] ans){
        if(root==null) return 0;
        int rightLevel = levels(root.right,ans);
        int leftLevel = levels(root.left,ans);
        int diff = Math.abs(rightLevel-leftLevel);
        if(diff>1) ans[0]=false;
        return 1 + Math.max(rightLevel,leftLevel);
    }
    public boolean isBalanced(TreeNode root) {
        boolean[] ans = {true};
        levels(root,ans);
        return ans[0];
    }
}