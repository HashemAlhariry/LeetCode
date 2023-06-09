class Solution {
   public int removeDuplicates(int[] nums) {
        int result = 1;
        int startIndex=0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]!=nums[i-1]){
                startIndex++;
                result++;
                nums[startIndex]=nums[i];
            }
        }
        return result;


    }
}