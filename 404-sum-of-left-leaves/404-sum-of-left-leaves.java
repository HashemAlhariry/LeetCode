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
        public int totalNumber=0;
    public int sumOfLeftLeaves(TreeNode root) {
        

          if(root==null)
                return totalNumber;

            if(root.left!=null && root.left.left==null && root.left.right==null ){
                totalNumber+=root.left.val;

            }
            if(root.left!=null){
                sumOfLeftLeaves(root.left);
            }
            if(root.right!=null){
                sumOfLeftLeaves(root.right);
            }

            return totalNumber;
    }
}