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
    public int levels(TreeNode root){
        if(root==null) return 0;
        return 1 + Math.max(levels(root.left),levels(root.right));
    }
    public void nthLevelLtoR(TreeNode root,int currLevel,int targetLevel,List<Integer> arr){
        if(root==null) return;
        if(currLevel==targetLevel) arr.add(root.val);
        nthLevelLtoR(root.left,currLevel+1,targetLevel,arr);
        nthLevelLtoR(root.right,currLevel+1,targetLevel,arr);
    }
    public void nthLevelRtoL(TreeNode root,int currLevel,int targetLevel,List<Integer> arr){
        if(root==null) return;
        if(currLevel==targetLevel) arr.add(root.val);
        nthLevelRtoL(root.right,currLevel+1,targetLevel,arr);
        nthLevelRtoL(root.left,currLevel+1,targetLevel,arr);
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int lvl = levels(root);
        for(int i = 0 ; i < lvl ;i++){
            List<Integer> arr = new ArrayList<>();
            if(i%2==0){
                nthLevelLtoR(root,0,i,arr);
            }else{
                nthLevelRtoL(root,0,i,arr);
            }
            ans.add(arr);
        }
        return ans;
    }
}