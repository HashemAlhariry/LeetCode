class Solution {
    public int singleNumber(int[] nums) {
                 
                    Map <Integer,Integer> mapOfNumber = new HashMap<>();
                    for (int i = 0; i <nums.length ; i++) {
                        if(mapOfNumber.containsKey(nums[i])){
                            mapOfNumber.put(nums[i],mapOfNumber.get(nums[i])+1);
                        }else {
                            mapOfNumber.put(nums[i],1);
                        }
                    }
                    for (Map.Entry<Integer,Integer> entry: mapOfNumber.entrySet()){
                        if(entry.getValue()==1)
                            return entry.getKey();
                    }
                    return -1;
    }
}