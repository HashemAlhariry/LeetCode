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
 public List<Integer> list =new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        boolean result=true;
        helperFunction(root);
        for (int i = 1; i <list.size() ; i++) {
            if(list.get(i)>list.get(i-1))
                continue;
            result=false;
        }
        return result;
    }

    private void helperFunction(TreeNode root) {
        if(root==null)
            return;
        helperFunction(root.left);
        list.add(root.val);
        helperFunction(root.right);
    }
}