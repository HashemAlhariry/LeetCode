//Problem
/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.



Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]


Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

*/

class ProductofArrayExceptSelf {

    public static void main(String[] args) {

        productExceptSelf(new int[]{1,2,3,4});

    }
    public static int[] productExceptSelf(int[] nums) {

        int left[]=new int[nums.length];
        int right[]=new int [nums.length];
        for (int i = 0; i <nums.length ; i++) {
            if(i==0)
                left[i]=nums[i];
            else
                left[i]=nums[i]*left[i-1];
        }

        for (int i = nums.length-1; i >=0 ; i--) {
            if(i==nums.length-1)
                right[i]=nums[i];
            else
                right[i]=nums[i]*right[i+1];
        }

        for (int i = 0; i <nums.length ; i++) {
            if(i==0)
                nums[i]=right[i+1];
            else if(i==nums.length-1)
                nums[i]=left[i-1];
            else
                nums[i]=left[i-1]*right[i+1];
        }

        return nums;
    }


}







