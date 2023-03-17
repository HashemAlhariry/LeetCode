/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

        public static final String LIMITER=",";
        public static final String NV="N";

        public String serialize(TreeNode root) {
            StringBuilder treeValues= new StringBuilder();
            helper(root,treeValues);
            return treeValues.toString();
        }
        void helper(TreeNode root, StringBuilder stringValue){
            if(root==null)
                stringValue.append(NV).append(LIMITER);
            else{
                stringValue.append(root.val).append(LIMITER);
                helper(root.left,stringValue);
                helper(root.right,stringValue);
            }
        }
        public TreeNode deserialize(String data) {
            Deque<String> nodes = new LinkedList<>();
            nodes.addAll(Arrays.asList(data.split(LIMITER)));
            return helperDeserialize(nodes);
        }
        public TreeNode helperDeserialize(Deque<String> node){
            String value = node.remove();
            if(value.equals(NV)){
                return null;
            }  else{
                TreeNode treeNode= new TreeNode(Integer.valueOf(value));
                treeNode.left=helperDeserialize(node);
                treeNode.right=helperDeserialize(node);
                return treeNode;
            }
        }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));