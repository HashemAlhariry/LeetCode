class Solution {

public  int removeDuplicates(int[] nums) {
        int nextIndex=0;
        int counter=0;
        for (int i = 0; i <nums.length; i++) {
            if(i==0) {
                nextIndex++;
                counter++;
            }else if(counter<2 && nums[i]==nums[i-1]){
                nums[nextIndex]=nums[i];
                counter++;
                nextIndex++;
            }else if(nums[i]!=nums[i-1]){
                nums[nextIndex]=nums[i];
                counter=1;
                nextIndex++;
            }
        }

        return nextIndex;
    }
}