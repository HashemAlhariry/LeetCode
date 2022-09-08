class Solution {
    public int[] numberOfPairs(int[] nums) {
          Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }

        int arr[]=new int[2];
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            int totalPairs;
            int totalRemains;
            totalPairs = entry.getValue()/2;
            totalRemains=entry.getValue()%2;
            arr[0]+=totalPairs;
            arr[1]+=totalRemains;
        }
        return arr;
    }
}