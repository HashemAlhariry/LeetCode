class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int rightSum= Arrays.stream(nums).sum();
        int leftSum=0;
        int [] result = new int[nums.length];
       
        for (int i = 0; i < nums.length; i++) {
            rightSum-=nums[i];
            result[i]=Math.abs(rightSum-leftSum);
            leftSum+=nums[i];
        }
        return result;
    }
}