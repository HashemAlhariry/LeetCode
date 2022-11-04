//Problem
/*


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







