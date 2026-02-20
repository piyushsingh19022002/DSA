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
    public void inorder(TreeNode root,List<Integer> sort){
        if(root==null) return;
        inorder(root.left,sort);
        sort.add(root.val);
        inorder(root.right,sort);
    }
    public TreeNode balancedBST(List<Integer> sort,int low,int high) {
        if(low>high) return null;
        int mid = low + (high-low)/2;
        TreeNode root = new TreeNode(sort.get(mid));
        root.left = balancedBST(sort,low,mid-1);
        root.right = balancedBST(sort,mid+1,high);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> sort = new ArrayList<>();
        inorder(root,sort);
        int high = sort.size()-1;
        return balancedBST(sort,0,high);
    }
}