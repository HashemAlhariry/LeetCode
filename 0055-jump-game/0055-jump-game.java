class Solution {
  public boolean canJump(int[] nums) {
        int currentIndex=nums.length-1;
        for (int i = nums.length-2; i >=0 ; i--) {
            if(currentIndex<=(i+nums[i]))
                currentIndex=i;
        }
        if(currentIndex==0) return true;
        return false;
    }
}