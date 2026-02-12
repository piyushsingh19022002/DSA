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
//     public void helper(TreeNode root,List<Integer> ans){
//         if(root==null) return;
//         helper(root.left,ans);
//         ans.add(root.val);
//         helper(root.right,ans);
//     }
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> ans = new ArrayList<>();
//         helper(root,ans);
//         return ans;
//     }
// }

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode temp = root;
        while(true){
            if(temp!=null){
                st.push(temp);
                temp = temp.left;
            }else{
                if(st.isEmpty()) break;
                else{
                    TreeNode top = st.pop();
                    ans.add(top.val);
                    temp = top.right;
                }
            }
        }
        return ans;
    }
}