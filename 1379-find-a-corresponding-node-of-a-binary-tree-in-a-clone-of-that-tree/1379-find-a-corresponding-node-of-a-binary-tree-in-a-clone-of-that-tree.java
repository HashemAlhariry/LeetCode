class Solution {
   public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
 
        getTarget( original,   cloned,   target);
        return answer;
    }
    public static TreeNode answer;
    private void getTarget(TreeNode original, TreeNode cloned, TreeNode target ) {
        if(target.val==cloned.val){
            answer=cloned;
            return;
        }
        if(original.left!=null)
            getTargetCopy(original.left,cloned.left,target);
        if(original.right!=null)
            getTargetCopy(original.right,cloned.right,target);
    }

}