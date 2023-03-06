class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,int []> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.get(target-nums[i])!=null){
                map.get(target-nums[i])[1]=i;
                return map.get(target-nums[i]);
            }else{
                int arr[]= new int[2];
                arr[0]=i;
                map.put(nums[i],arr);
            }
        }
        return null;
    }
}