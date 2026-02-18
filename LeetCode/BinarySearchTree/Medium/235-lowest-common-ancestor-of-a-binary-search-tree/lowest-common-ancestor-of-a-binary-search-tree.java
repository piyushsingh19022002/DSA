// class Solution {
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         if(root.val==p.val || root.val==q.val) return root; // ya to root ho p ya q
//         if(root.val>q.val && root.val<p.val) return root; // p right me or q left me
//         if(root.val<q.val && root.val>p.val) return root; // q right me or p left me
//         if(p.val<root.val && q.val<root.val) return lowestCommonAncestor(root.left,p,q);
//         else return lowestCommonAncestor(root.right,p,q);
//     }
// }

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val<root.val && q.val<root.val) return lowestCommonAncestor(root.left,p,q);
        else if(p.val>root.val && q.val>root.val) return lowestCommonAncestor(root.right,p,q);
        else return root;
    }
}