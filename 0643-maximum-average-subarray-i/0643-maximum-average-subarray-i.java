class Solution {
 public double findMaxAverage(int[] nums, int k) {
        double result=0,temp=0;
        for (int i = 0; i <k ; i++) {
            temp+=nums[i];
        }
        result=temp/k;
        for (int i = 1; i <nums.length-k+1 ; i++) {
            temp-=nums[i-1];
            temp+=nums[i+k-1];
            if(result<temp/k)
                result=temp/k;
        }

        return result;
    }

}