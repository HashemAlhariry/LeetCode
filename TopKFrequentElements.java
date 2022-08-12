//Problem Description
/*
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.



Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]


Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
k is in the range [1, the number of unique elements in the array].
It is guaranteed that the answer is unique.


Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
*/


import java.util.*;

public class TopKFrequentElements {

    public static void main(String[] args) {
        int arr[] = new int[]{1,1,1,2,2,3};
        Arrays.stream(topKFrequent(arr, 2)).forEach(e-> System.out.println(e));

    }

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
}
class CustomizedHashMap implements Comparator<Map.Entry<Integer, Integer>> {
    @Override
    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
        return o2.getValue()-o1.getValue();
    }
}










