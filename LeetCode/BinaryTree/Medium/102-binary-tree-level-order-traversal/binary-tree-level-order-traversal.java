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
    // public int level(TreeNode root){
    //     if(root==null)return 0;
    //     return 1 + Math.max(level(root.left),level(root.right));
    // }
//     public void helper(TreeNode root,List<Integer> arr,int currLevel,int targetLevel){
//         if(root==null) return;
//         if(currLevel==targetLevel){
//             arr.add(root.val);
//             return; // agar mera currLevel equal ho jaye targetLevel ko to return
//         }
//         helper(root.left,arr,currLevel+1,targetLevel);
//         helper(root.right,arr,currLevel+1,targetLevel);
//     }
//     public List<List<Integer>> levelOrder(TreeNode root) {
//         List<List<Integer>> ans = new ArrayList<>();
//         int l = level(root);
//         for(int i = 0; i < l; i++){
//             List<Integer> arr = new ArrayList<>();
//             helper(root,arr,0,i);
//             ans.add(arr);
//         }
//         return ans;
//     }
// }
class Solution {
    public class Pair{
        TreeNode node;
        int level;
        Pair(TreeNode n,int l){
            node = n;
            level = l;
        }
    }
    public int level(TreeNode root){
        if(root==null)return 0;
        return 1 + Math.max(level(root.left),level(root.right));
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int totalLvl = level(root);
        for(int i = 0; i < totalLvl; i++){
            List<Integer> arr = new ArrayList<>();
            ans.add(arr);
        }
        Queue<Pair> q = new LinkedList<>();
        if(root!=null) q.add(new Pair(root,0));
        while(q.size()>0){
            Pair front = q.remove();
            TreeNode temp = front.node;
            int lvl = front.level;
            ans.get(lvl).add(temp.val);
            if(temp.left!=null) q.add(new Pair(temp.left,lvl+1));
            if(temp.right!=null) q.add(new Pair(temp.right,lvl+1));
        }
        return ans;
    }
}