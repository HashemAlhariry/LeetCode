class Solution {
   public int maximizeSum(int[] nums, int k) {
        int max = nums[0];
        for (int m: nums)
            max = Math.max(m, max);
        int sum = 0;
        for (int i = 0; i < k ; i++)
            sum += max++;
        return sum;
    }
}