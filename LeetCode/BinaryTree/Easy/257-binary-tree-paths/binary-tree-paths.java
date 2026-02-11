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
    public void paths(TreeNode root,String s, List<String> ans){
        if(root==null) return; // first base case when if tree is empty;
        // if both left and right are null then it is leaf node and then we
        // just have to add value and add string to ans
        if(root.left==null && root.right==null){
            s += root.val;
            ans.add(s);
            return;
        }
        paths(root.left,s+root.val+"->",ans); // call for left part 
        paths(root.right,s+root.val+"->",ans); // call for right part
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        paths(root,"",ans);
        return ans;
    }
}