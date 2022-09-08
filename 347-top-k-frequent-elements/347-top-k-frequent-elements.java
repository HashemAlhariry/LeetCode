class Solution {

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            if(hashMap.containsKey(nums[i])){
                hashMap.put(nums[i],hashMap.get(nums[i])+1);
            }else {
                hashMap.put(nums[i],1);
            }
        }
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(hashMap.entrySet());
        Collections.sort(entries,new CustomizedHashMap());
        int arr[] = new int[k];
        for (int i = 0; i < entries.size(); i++) {
            if(i<k){
                arr[i]=entries.get(i).getKey();
            }
        }
        return arr;
    }
    
}class CustomizedHashMap implements Comparator<Map.Entry<Integer, Integer>> {
    @Override
    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
        return o2.getValue()-o1.getValue();
    }
}
