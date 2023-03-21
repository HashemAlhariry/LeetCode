class Solution {

    public static List<Integer> lexicalOrder(int n) {
        Set<Integer> result = new LinkedHashSet<>();
        dfs(1,9,n,result);
        return new ArrayList<>(result);
    }

    private static void dfs(int i, int end,int n, Set<Integer> result) {
        if(i>n)
            return;
        for (int j = i; j <=n && j<=end; j++) {
            result.add(j);
            dfs(j*10,j*10+9,n,result);
        }
    }
}