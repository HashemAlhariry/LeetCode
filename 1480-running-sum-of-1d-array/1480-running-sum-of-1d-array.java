class Solution {
    public int[] runningSum(int[] nums) {
             int arr[] = new int[nums.length];
        int totalSum=0;
        for (int i = 0; i < nums.length ; i++) {
            totalSum+=nums[i];
            arr[i]=totalSum;
        }
        return arr;
    }
}