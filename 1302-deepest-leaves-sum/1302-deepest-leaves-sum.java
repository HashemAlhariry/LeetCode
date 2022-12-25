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

    public  int deepestLeavesSum(TreeNode root) {
        TreeNode temp1= root;
        TreeNode temp2= root;
        maximumDepth(temp1);
        maximumDepthTemp=0;
        getCounters(temp2);
        return totalNumber;
    }

    public  int maximumDepthTemp = 0;
    public  int maximumDepth =0;
    public  int totalNumber = 0;
    public  void maximumDepth (TreeNode root){

        if(root.left == null && root.right==null){
            if(maximumDepth<maximumDepthTemp)
                maximumDepth=maximumDepthTemp;
            return;
        }
        if(root.left != null){
            maximumDepthTemp++;
            maximumDepth(root.left);
            maximumDepthTemp--;
        }

        if(root.right != null){
            maximumDepthTemp++;
            maximumDepth(root.right);
            maximumDepthTemp--;
        }


    }
    public  void getCounters (TreeNode root){

        if(root.left == null && root.right==null && maximumDepthTemp==maximumDepth ){
            totalNumber+=root.val;
            return;
        }
        if(root.left != null){
            maximumDepthTemp++;
            getCounters(root.left);
            maximumDepthTemp--;
        }

        if(root.right != null){
            maximumDepthTemp++;
            getCounters(root.right);
            maximumDepthTemp--;
        }


    }
}