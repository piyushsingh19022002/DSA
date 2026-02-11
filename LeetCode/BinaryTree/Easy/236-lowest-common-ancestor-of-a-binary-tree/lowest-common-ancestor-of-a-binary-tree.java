/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean exists(TreeNode root,TreeNode key){
        if(root==key) return true;
        if(root==null) return false; // key ke mile bina end me pahuch gye
        return exists(root.left,key) || exists(root.right,key);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p==root || q==root) return root;
        boolean pLieInLST = exists(root.left,p);
        boolean qLieInLST = exists(root.left,q);
        // if(pLieInLST && !qLieInLST) return root;
        // if(qLieInLST && !pLieInLST) return root;
        if(pLieInLST && qLieInLST) return lowestCommonAncestor(root.left,p,q);
        if(!pLieInLST && !qLieInLST) return lowestCommonAncestor(root.right,p,q);
        else return root; // in place of above commented
    }
}