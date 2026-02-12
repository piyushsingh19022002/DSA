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
        if(root==null)return 0;
        return 1 + Math.max(level(root.left),level(root.right));
    }
    public void helper(TreeNode root,List<Integer> arr,int currLevel,int targetLevel){
        if(root==null) return;
        if(currLevel>targetLevel) return; // agar mera currLevel cross kar jaye targetLevel ko to return
        if(currLevel==targetLevel) arr.add(root.val);
        helper(root.left,arr,currLevel+1,targetLevel);
        helper(root.right,arr,currLevel+1,targetLevel);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int l = level(root);
        for(int i = 0; i < l; i++){
            List<Integer> arr = new ArrayList<>();
            helper(root,arr,0,i);
            ans.add(arr);
        }
        return ans;
    }
}