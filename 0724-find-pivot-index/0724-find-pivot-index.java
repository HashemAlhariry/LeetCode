class Solution {
   public int pivotIndex(int[] nums) {
           int totalLeft=0;
        int totalRight=0;

        for (int i = 1; i <nums.length ; i++) {
            totalRight+=nums[i];
        }

        if(totalLeft==totalRight)
            return 0;


        for (int i = 1; i <nums.length ; i++) {
            totalRight-=nums[i];
            totalLeft+=nums[i-1];
            if(totalLeft==totalRight)
                return i;
        }

        return -1;
    }
}