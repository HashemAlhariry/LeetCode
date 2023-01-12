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
    public  int minimumVal= Integer.MAX_VALUE;
    public  int getMinimumDifference(TreeNode root) {

        traverseTree(root);
        return minimumVal;
    }

    private  void traverseTree(TreeNode root) {
        if(root==null)
            return;

        traverseWithAllTree(root,root);

        traverseTree(root.left);
        traverseTree(root.right);
    }

    private  void traverseWithAllTree(TreeNode root, TreeNode base) {
        if(root==null || base==null)
            return;
        
        if(root.val!=base.val) {
            if (minimumVal > Math.abs(root.val - base.val)) {
                minimumVal = Math.abs(root.val - base.val);
            }
        }

        traverseWithAllTree(root,base.left);
        traverseWithAllTree(root,base.right);
    }



}