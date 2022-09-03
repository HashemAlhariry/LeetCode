class Solution {
    public boolean containsDuplicate(int[] nums) {
               Set<Integer> integer = new HashSet<Integer>();

        for (int i = 0; i <nums.length ; i++) {
            boolean checker = integer.add(nums[i]);
            if(!checker)
                return true;
        }
        
        return false;
    }
}