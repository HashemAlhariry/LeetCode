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
    public  int counter=0;
    public  int temp=0;
    public  int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        temp++;
        if(counter<temp)
            counter=temp;
        if(root.left!=null){
            maxDepth(root.left);
            temp--;
        }
        if(root.right!=null){
            maxDepth(root.right);
            temp--;
        }
        
        return counter;

    }
}