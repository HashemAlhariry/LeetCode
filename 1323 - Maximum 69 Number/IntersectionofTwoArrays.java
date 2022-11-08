//Problem
/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.



Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.


Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000

*/


import java.util.*;

class IntersectionofTwoArrays {
    public static void main(String[] args) {

            intersection(new int[]{1,2,2,1}, new int[] {2,2});
    }
    public static int[] intersection(int[] nums1, int[] nums2) {

        Map<Integer,Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < nums1.length ; i++) {
            if(map.get(nums1[i])==null){
                map.put(nums1[i],1);
            }
        }

        for (int i = 0; i < nums2.length ; i++) {
            if(map.get(nums2[i])!=null && map.get(nums2[i])==1) {
                map.put(nums2[i], map.get(nums2[i]) + 1);
            }
        }

        List <Integer> integers = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()>1)
                integers.add(entry.getKey());
        }
        int[] arr = integers.stream().mapToInt(i->i).toArray();

        return arr;
    }



}







