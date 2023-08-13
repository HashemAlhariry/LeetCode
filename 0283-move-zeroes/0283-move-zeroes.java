class Solution {
  public  void moveZeroes(int[] nums) {
       int currentIndex=0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]!=0) {
                nums[currentIndex++] = nums[i];
            }
        }
        while (currentIndex<nums.length){
            nums[currentIndex++]=0;
        }
    }

}