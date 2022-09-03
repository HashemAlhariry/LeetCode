class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
         List<Integer> list = new ArrayList<>();
        int temp;
        int i=0;

        while (i<nums.length){
            if(i==nums[i]-1 || nums[i]==nums[nums[i]-1] ){
                i++;
                continue;
            }else {
                temp= nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if(nums[j]-1!=j)
                list.add(j+1);
        }

        return list;
    }
}