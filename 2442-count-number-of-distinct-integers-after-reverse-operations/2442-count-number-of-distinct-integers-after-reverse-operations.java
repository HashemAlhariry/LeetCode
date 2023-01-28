class Solution {
   public  int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <nums.length ; i++) {
            set.add(nums[i]);
            set.add(reverseNumber(nums[i]));
        }
        
        return set.size();
    }

    public  int reverseNumber(int number){
        int  reverse = 0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        return reverse;
    }
}