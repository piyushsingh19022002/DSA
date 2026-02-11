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
    public TreeNode invert(TreeNode root){
        if(root==null) return root;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
        return root;
    }
    public boolean isSame(TreeNode l,TreeNode r){
        if(l==null && r==null) return true;
        if(l==null || r==null) return false;
        if(l.val!=r.val) return false;
        if(!isSame(l.left,r.left)) return false;
        if(!isSame(l.right,r.right)) return false;
        return true;
    }
    public boolean isSymmetric(TreeNode root) {
        TreeNode l = root.left;
        TreeNode r = invert(root.right);
        return isSame(l,r);
    }
}