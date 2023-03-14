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
    List<TreeNode> treeNodeList = new ArrayList<>();
    public void flatten(TreeNode root) {
        helper(root);
        for (int i = 0; i <treeNodeList.size()-1 ; i++) {
            TreeNode node = treeNodeList.get(i);
            node.right=treeNodeList.get(i+1);
            node.left=null;
        }
    }
    private void helper(TreeNode root) {
        if(root==null)
            return;
        treeNodeList.add(root);
        helper(root.left);
        helper(root.right);
    }
}