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
    public void insertIntoBST(TreeNode root,int val){
        if(val>root.val){
            if(root.right==null) root.right = new TreeNode(val);
            else insertIntoBST(root.right,val);
        }else{
            if(root.left==null) root.left = new TreeNode(val);
            else insertIntoBST(root.left,val);
        }
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        for(int i = 1 ; i < preorder.length;i++){
            insertIntoBST(root,preorder[i]);
        }
        return root;
    }
}