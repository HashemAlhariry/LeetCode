class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> res = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <nums1.length ; i++) {
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        for (int i = 0; i <nums2.length ; i++) {
           if(map.containsKey(nums2[i]) && map.get(nums2[i])!=0) {
               res.add(nums2[i]);
               map.put(nums2[i],map.getOrDefault(nums2[i],0)-1);
           }
        }

        int[] resArr = new int[res.size()];
        for(int i = 0; i < res.size(); i++) resArr[i] = res.get(i);
 
        return resArr;
    }
}