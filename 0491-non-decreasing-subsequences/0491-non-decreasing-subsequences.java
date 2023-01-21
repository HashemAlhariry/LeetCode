class Solution {
    public static List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> res = new HashSet<List<Integer>>();
        List<Integer> sequence=new ArrayList<>();
        findSubSeq(nums,sequence,res,0);
        return new ArrayList<>(res);
    }
    private static void findSubSeq(int[] nums, List<Integer> currentList, Set<List<Integer>> result, int index){
        if(currentList.size()>=2){
            result.add(new ArrayList<>(currentList));
        }

        for (int i = index; i < nums.length; i++) {

            if (currentList.isEmpty() || currentList.get(currentList.size() - 1) <= nums[i]) {
                currentList.add(nums[i]);
                findSubSeq(nums, currentList, result, i + 1);
                currentList.remove(currentList.size() - 1);
            }
        }
    }
}