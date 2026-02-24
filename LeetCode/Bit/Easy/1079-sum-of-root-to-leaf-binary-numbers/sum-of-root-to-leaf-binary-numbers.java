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
    public void path(TreeNode root,String str,List<String> paths){
        if(root==null){
           return;
        }
        if(root.left==null && root.right==null){
            str+=root.val;
            paths.add(str);
            return;
        }
        path(root.left,str+root.val,paths);
        path(root.right,str+root.val,paths);
    }
    public int sumRootToLeaf(TreeNode root) {
        int sum = 0;
        List<String> paths = new ArrayList<>();
        path(root,"",paths);
        for(String s:paths){
            int val = Integer.parseInt(s,2);
            sum+=val;
        } 
        return sum;   
    }
}