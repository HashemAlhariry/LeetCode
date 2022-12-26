class Solution {
    public static List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> result = new ArrayList<>();
        dfs(result,new ArrayList<Integer>(),1,n,k);
        return result;

    }

    private static void dfs(List<List<Integer>> result,
                            List<Integer> current,
                            int index,
                            int n,
                            int k) {

        if(current.size()==k){
            result.add(new ArrayList<>(current));
            return;
        }
        if(current.size()>k)
            return;

        List<Integer> list = new ArrayList<>();
        list.addAll(current);
        for (int i = index; i <=n ; i++) {
            list.add(i);
            dfs(result,list,i+1,n,k);
            list.remove(list.size()-1);
        }
    }

}