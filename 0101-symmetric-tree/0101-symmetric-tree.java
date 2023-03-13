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
    public boolean isSymmetric(TreeNode root) {

       if (root==null) return true;
       return helperFunction(root.left,root.right);
    }

    private boolean helperFunction(TreeNode rootA,TreeNode rootB) {
            if(rootA==null && rootB==null)
                return true;
            if(rootA==null || rootB==null)
                return false;
            return rootA.val==rootB.val && helperFunction(rootA.left,rootB.right)&& helperFunction(rootA.right,rootB.left);
    }
}