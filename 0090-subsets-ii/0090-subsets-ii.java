class Solution {
    
    List<List<Integer>> res = new LinkedList();
    int[] arr;
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        arr=nums;
        Arrays.sort(arr);
        dfs(new ArrayList<Integer>(),0);
        return res;
    }
    
    
    public  void dfs(List<Integer> sub, int currIndex) {
        res.add(new ArrayList<>(sub));
        for(int i=currIndex; i<arr.length;i++){
            if(i!=currIndex && arr[i]==arr[i-1]) continue;
            sub.add(arr[i]);
            dfs(sub,i+1);
            sub.remove(sub.size()-1);
                   
        }
    }
}