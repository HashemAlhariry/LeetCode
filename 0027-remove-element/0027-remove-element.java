class Solution {
   public int removeElement(int[] nums, int val) {

        int [] result = new int[nums.length];
        int counter=0;

        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]==val)
                continue;

            result[counter]=nums[i];
            counter++;
        }
        for (int i = 0; i < counter; i++) {
                nums[i]=result[i];
        }
        return counter;
    }
}