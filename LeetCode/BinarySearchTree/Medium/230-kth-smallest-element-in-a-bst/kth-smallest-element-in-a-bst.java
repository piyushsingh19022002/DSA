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
// class Solution {
//     public void inorder(TreeNode root,List<Integer> ans){
//         if(root==null) return;
//         inorder(root.left,ans);
//         ans.add(root.val);
//         inorder(root.right,ans);
//     }
//     public int kthSmallest(TreeNode root, int k) {
//         List<Integer> ans = new ArrayList<>();
//         inorder(root,ans);
//         return ans.get(k-1);
//     }
// }
class Solution {
    int count=0;
    int ans = -1;
    public void inorder(TreeNode root, int k){
        if(root==null) return;
        inorder(root.left,k);
        count++;
        if(k==count){
            ans = root.val;
        }
        inorder(root.right,k);
    } 
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return ans;
    }
}