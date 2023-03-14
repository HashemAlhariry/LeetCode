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
    public int result=0;
    public int sumNumbers(TreeNode root) {
        String str="";
        helperFunction(root,str);
        return result;
    }

    private void helperFunction(TreeNode root,String currentNumber) {
        if(root==null)
            return;
        currentNumber+=root.val;
        if(root.left==null&&root.right==null){
            result+=Integer.parseInt(currentNumber);
        }
        helperFunction(root.left,currentNumber);
        helperFunction(root.right,currentNumber);
    }

}