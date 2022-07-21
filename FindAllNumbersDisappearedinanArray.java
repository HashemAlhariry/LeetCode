//Problem Description
/*
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.



Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]


Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n


Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.


*/

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {

    public static void main(String[] args) {
        int arr[] = new int[]{4,3,2,7,8,2,3,1};
        findDisappearedNumbers(arr).stream().forEach(e-> System.out.println(e));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

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
                list.add(j);
        }

        return list;
    }

}

