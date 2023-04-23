class Solution {
public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        dfs(result,nums,new ArrayList<Integer>(),0);
        return result;
    }

    public static void dfs(List<List<Integer>> result, int[] nums, List<Integer> tempList, int i) {

        if(i>nums.length-1){
            result.add(tempList);
            return;
        }
        tempList.add(nums[i]);
        dfs(result,nums,new ArrayList<>(tempList),i+1);

        tempList.remove(tempList.size()-1);
        dfs(result,nums,new ArrayList<>(tempList),i+1);
    }
}