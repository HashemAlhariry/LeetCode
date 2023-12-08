class Solution {
   public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0]+nums[1]+nums[2];
        for (int i = 0; i <nums.length-2 ; i++) {
            if(result==target) return result;
            int l=i+1;
            int r=nums.length-1;
            while (l<r){
                
                int temp = nums[i]+nums[l]+nums[r];
                if(Math.abs(target-result)>Math.abs(target-temp))
                    result=temp;
                
                if(temp<target)
                    l++;
                else 
                    r--;
            }
        }
        return result;
    }
}