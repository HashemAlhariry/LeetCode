import java.util.LinkedHashMap;
import java.util.Map;

//Problem
/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.



Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]


Constraints:

n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.


Follow up: Could you come up with a one-pass algorithm using only constant extra space?
*/
class SortColors {

    public static void main(String[] args) {



    }
    public static void sortColors(int[] nums) {

        Map<Integer,Integer> map = new LinkedHashMap<>();
        map.put(0,0);
        map.put(1,0);
        map.put(2,0);

        for (int i = 0; i < nums.length ;i++) {
            if(nums[i]==0)
                map.put(0,map.get(0)+1);
            if(nums[i]==1)
                map.put(1,map.get(1)+1);
            if(nums[i]==2)
                map.put(2,map.get(2)+1);
        }

        int redCounter=map.get(0);
        int whiteCounter=map.get(1);
        int blueCounter=map.get(2);

        for (int i = 0; i <redCounter ; i++) {
            nums[i]=0;
        }
        for (int i = redCounter; i <redCounter+whiteCounter ; i++) {
            nums[i]=1;
        }
        for (int i = redCounter+whiteCounter; i <redCounter+whiteCounter+blueCounter ; i++) {
            nums[i]=2;
        }



    }

}







