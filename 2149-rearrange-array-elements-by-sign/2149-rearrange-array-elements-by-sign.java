class Solution {
    public int[] rearrangeArray(int[] nums) {

        int positive[] = new int[nums.length/2];
        int negative[] = new int[nums.length/2];



        int pos=0,neg=0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]<0){
                negative[neg]=nums[i];
                neg++;
            }else{
                positive[pos]=nums[i];
                pos++;
            }
        }
        pos=0;
        neg=0;
        for (int i = 0; i <nums.length; i++) {
            if(i%2==0){
                nums[i]=positive[pos];
                pos++;
            }else {
                nums[i]=negative[neg];
                neg++;
            }
        }

        return nums;
    }
}