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
    public void nthLevelTraversal(TreeNode root,int currLevel,int targetLevel,List<Integer> ans){
        if(root==null) return;
        if(currLevel==targetLevel){
            ans.set(targetLevel,root.val);
            return;
        }
        nthLevelTraversal(root.left,currLevel+1,targetLevel,ans);
        nthLevelTraversal(root.right,currLevel+1,targetLevel,ans);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        int lvl = level(root);
        for(int i = 0 ; i < lvl ; i++){
            ans.add(0);
        }
        for(int i = 0 ; i < lvl ; i++){
            nthLevelTraversal(root,0,i,ans);
        }
        return ans;
    }
}