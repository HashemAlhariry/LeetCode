//Problem
/*

Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

A leaf is a node with no children.

 

Example 1:


Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
Output: true
Explanation: The root-to-leaf path with the target sum is shown.
Example 2:


Input: root = [1,2,3], targetSum = 5
Output: false
Explanation: There two root-to-leaf paths in the tree:
(1 --> 2): The sum is 3.
(1 --> 3): The sum is 4.
There is no root-to-leaf path with sum = 5.
Example 3:

Input: root = [], targetSum = 0
Output: false
Explanation: Since the tree is empty, there are no root-to-leaf paths.
 

Constraints:

The number of nodes in the tree is in the range [0, 5000].
-1000 <= Node.val <= 1000
-1000 <= targetSum <= 1000
*/
class PathSum {

    public static void main(String[] args) {

        PathSum pathSum = new PathSum();
        TreeNode n1 = new TreeNode(1);
        TreeNode n13 = new TreeNode(13);
        TreeNode n4a = new TreeNode(4);
        n4a.right=n1;
        TreeNode n7 = new TreeNode(7);
        TreeNode n2 = new TreeNode(2);
        TreeNode n11 = new TreeNode(11);
        n11.left=n7;
        n11.right=n2;
        TreeNode n8 = new TreeNode(8);
        n8.left=n13;
        n8.right=n4a;


        TreeNode n4 = new TreeNode(4);
        n4.left=n11;

        TreeNode root = new TreeNode(5);
        root.left=n4;
        root.right=n8;
        pathSum.hasPathSum(root,22);

    }

    public  boolean checker=false;
    public  boolean hasPathSum(TreeNode root, int targetSum) {
        checkTarget(root, targetSum, 0);
        if(root == null)
            return false;
        return checker;
    }
    private  void checkTarget(TreeNode root, int targetSum, int i) {
        if(root!=null )
            i+=root.val;

        if(root!=null &&root.left!=null)
            checkTarget(root.left,targetSum,i);

        if(root!=null &&root.right!=null)
            checkTarget(root.right,targetSum,i);

        if(targetSum==i&& root.right==null && root.left==null)
            checker=true;
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }




}







