class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int maximumXor = 0;
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i; j <nums.length ; j++) {
                if(Math.abs(nums[i]-nums[j])<=Math.min(nums[i],nums[j]) && maximumXor < (nums[i]^nums[j]))
                    maximumXor=nums[i]^nums[j];
            }
        }
        return maximumXor;
    }
}