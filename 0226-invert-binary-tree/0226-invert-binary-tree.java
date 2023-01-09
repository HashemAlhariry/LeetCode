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
  public TreeNode invertTree(TreeNode root) {
        TreeNode temp =root;
        invTree(temp);
        return root;
    }

    private  void  invTree(TreeNode root) {

        if(root==null)
            return ;

            TreeNode tLeft = root.left;
            TreeNode tRight=root.right;

            if(tLeft!=null){
                root.right=tLeft;
            }else {
                root.right=null;
            }
            if(tRight!=null) {
                root.left = tRight;
            }else {
                root.left =null;
            }
            invertTree(root.left);
            invertTree(root.right);
    }
}