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
    public int kthSmallest(TreeNode root, int k) {
        int result=0;
        List<Integer> list = new ArrayList<>();
        helperFunction(root,list);
        return list.get(k-1);

    }
    public void helperFunction(TreeNode node,List<Integer> list){
        if(node!=null){
            helperFunction(node.left,list);
            list.add(node.val);
            helperFunction(node.right,list);
        }
    }
}