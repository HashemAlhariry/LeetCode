class Solution {
    public int singleNonDuplicate(int[] nums) {
       HashMap<Integer,Integer>map= new HashMap<>();
        for (int i =0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for (Integer numb:map.keySet()){
            if(map.get(numb)==1)
                return numb;
        }
        return -1; 
    }
}