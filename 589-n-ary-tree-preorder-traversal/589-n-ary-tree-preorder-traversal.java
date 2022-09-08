class Solution {
   public  List<Integer> list = new ArrayList<>();
    public  List<Integer> preorder(Node root) {
        if(root!=null)
            list.add(root.val);
        
        if(root!=null && root.children!=null)
            for (int i = 0; i <root.children.size() ; i++) {
                preorder(root.children.get(i));
             }
        
        return list;
    }
}