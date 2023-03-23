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
   int result=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        helperFunction(root,low,high);
        return result;
    }

    private void helperFunction(TreeNode root, int low, int high) {
        if(root==null)
            return;
        if(root.val<=high && root.val>=low)
            result+=root.val;
        helperFunction(root.left,low,high);
        helperFunction(root.right,low,high);
    }
}