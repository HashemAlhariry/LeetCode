//Problem Description
/*
Given the root of a binary tree, return the sum of all left leaves.

A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.



Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: 24
Explanation: There are two left leaves in the binary tree, with values 9 and 15 respectively.
Example 2:

Input: root = [1]
Output: 0


Constraints:

The number of nodes in the tree is in the range [1, 1000].
-1000 <= Node.val <= 1000
*/

public class SumofLeftLeaves {
    public static void main(String[] args) {

        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3= new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);


        t1.left=t2;
        t1.right=t3;
        t2.left=t4;
        t2.right=t5;

        int sum = sumOfLeftLeaves(t1);

    }

    public static int totalNumber=0;
    public static int sumOfLeftLeaves(TreeNode root) {

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

  class TreeNode {
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
