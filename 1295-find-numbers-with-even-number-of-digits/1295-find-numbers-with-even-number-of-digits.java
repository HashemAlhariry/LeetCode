class Solution {
    public static int findNumbers(int[] nums) {
        int counter=0;
        for(int i =0 ; i< nums.length; i++){
            if((nums[i]>9 && nums[i]<100) || (nums[i]>999 && nums[i]<10000) || nums[i]==100000){
                counter++;
            }
        }
        return counter;
    }
    public static int findNumbers2(int[] nums) {
        return  (int) Arrays.stream(nums).filter(e-> (e>9 && e<100) || (e>999 && e<10000) || e==100000).count();
    }
}