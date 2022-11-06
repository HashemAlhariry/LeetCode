import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

//Problem
/*

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.



Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2


Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109


Follow-up: Could you solve the problem in linear time and in O(1) space?
*/
class MajorityElement {

    public static void main(String[] args) {


         majorityElement(new int[]{2,2,1,1,1,2,2});

    }

    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i])+1);
            else{
                map.put(nums[i],1);
            }

        }
        Set<Integer> keys = map.keySet();
        int maxNumber=0;
        int totalKeys=0;
        for (Integer key : keys) {
            if(totalKeys<map.get(key)){
                maxNumber=key;
                totalKeys=map.get(key)
            }

        }

        return maxNumber;
    }
}







