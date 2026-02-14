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
    public List<Integer> copy(List<Integer> arr){
        List<Integer> aarr = new ArrayList<>();
        for(int ele : arr){
            aarr.add(ele);
        }
        return aarr;
    }
    public void helper(TreeNode root,int targetSum,List<Integer> arr,List<List<Integer>> ans){
        if(root==null)return;
        if(root.left==null && root.right==null){
            if(root.val==targetSum){
                arr.add(root.val);
                ans.add(arr);
                return;
            }
        }
        arr.add(root.val);
        List<Integer> arr1 = copy(arr);
        List<Integer> arr2 = copy(arr);
        helper(root.left,targetSum-root.val,arr1,ans);
        helper(root.right,targetSum-root.val,arr2,ans);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(root,targetSum,new ArrayList<Integer>(),ans);
        return ans;
    }
}