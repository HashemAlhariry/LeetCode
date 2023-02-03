class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int first=0;
        int last=nums.length-1;
        int res=0;
        for (int i = 0; i <nums.length/2; i++) {
            res=Math.max(res,nums[first]+nums[last]);
            first++;
            last--;
        }
        return res;
    }
}