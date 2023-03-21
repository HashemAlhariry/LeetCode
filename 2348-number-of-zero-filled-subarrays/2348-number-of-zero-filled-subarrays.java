class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long numberOfZeros=0;
        long tempZeros=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                tempZeros++;
            }else{
                // updateNumberOfZeros
                numberOfZeros+=((tempZeros*(tempZeros+1))/2);
                tempZeros=0;
            }
        }
        if(tempZeros!=0){
            numberOfZeros+=((tempZeros*(tempZeros+1))/2);
        }
        return numberOfZeros;
    }
}