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
//     ArrayList<Integer> ans;
//     public void preorder(TreeNode root){
//         if(root==null) return;
//         ans.add(root.val);
//         preorder(root.left);
//         preorder(root.right);
//     }
//     public List<Integer> preorderTraversal(TreeNode root) {
//         ans = new ArrayList<>();
//         preorder(root);
//         return ans;
//     }
// }

// class Solution {
//     public void preorder(TreeNode root,List<Integer> ans){
//         if(root==null) return;
//         ans.add(root.val);
//         preorder(root.left,ans);
//         preorder(root.right,ans);
//     }
//     public List<Integer> preorderTraversal(TreeNode root) {
//         List<Integer> ans = new ArrayList<>();
//         preorder(root,ans);
//         return ans;
//     }
// }

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root!=null) st.push(root);
        while(!st.isEmpty()){
            TreeNode top = st.pop();
            ans.add(top.val);
            if(top.right!=null) st.push(top.right);
            if(top.left!=null) st.push(top.left);
        }
        return ans;
    }
}