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
    public void path(TreeNode root,String str,int[] sum){
        if(root==null){
           return;
        }
        if(root.left==null && root.right==null){
            str+=root.val;
            sum[0]+=Integer.parseInt(str,2);
            return;
        }
        path(root.left,str+root.val,sum);
        path(root.right,str+root.val,sum);
    }
    public int sumRootToLeaf(TreeNode root) {
        int[] sum = {0};
        path(root,"",sum);
        return sum[0];   
    }
}