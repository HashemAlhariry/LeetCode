//Problem Description
/*
You are given an integer array nums. You can choose exactly one index (0-indexed) and remove the element. Notice that the index of the elements may change after the removal.

For example, if nums = [6,1,7,4,1]:

Choosing to remove index 1 results in nums = [6,7,4,1].
Choosing to remove index 2 results in nums = [6,1,4,1].
Choosing to remove index 4 results in nums = [6,1,7,4].
An array is fair if the sum of the odd-indexed values equals the sum of the even-indexed values.

Return the number of indices that you could choose such that after the removal, nums is fair.



Example 1:

Input: nums = [2,1,6,4]
Output: 1
Explanation:
Remove index 0: [1,6,4] -> Even sum: 1 + 4 = 5. Odd sum: 6. Not fair.
Remove index 1: [2,6,4] -> Even sum: 2 + 4 = 6. Odd sum: 6. Fair.
Remove index 2: [2,1,4] -> Even sum: 2 + 4 = 6. Odd sum: 1. Not fair.
Remove index 3: [2,1,6] -> Even sum: 2 + 6 = 8. Odd sum: 1. Not fair.
There is 1 index that you can remove to make nums fair.
Example 2:

Input: nums = [1,1,1]
Output: 3
Explanation: You can remove any index and the remaining array is fair.
Example 3:

Input: nums = [1,2,3]
Output: 0
Explanation: You cannot make a fair array after removing any index.


Constraints:

1 <= nums.length <= 105
1 <= nums[i] <= 104
*/


import java.util.List;

public class WaystoMakeaFairArray {
    public static void main(String[] args) {

        System.out.println(waysToMakeFair(new int[]{1,2,3}));;

    }
    //ENHANCED ALGORITHM
    public static int waysToMakeFair(int[] nums) {

        int totalOddR=0;
        int totalEvenR=0;
        int totalNumber=0;

        for (int i = 0; i <nums.length ; i++) {
            if(i%2==0)
                totalEvenR+=nums[i];
            else
                totalOddR+=nums[i];
        }

        int totalEvenL=0;
        int totalOddL=0;

        for (int i = 0; i <nums.length ; i++) {

            if(i%2==0)
                totalEvenR-=nums[i];
            else
                totalOddR-=nums[i];


            if((totalEvenR+totalOddL)== (totalOddR+totalEvenL))
                totalNumber++;

            if(i%2==0)
                totalEvenL+=nums[i];
            else
                totalOddL+=nums[i];
        }
        return totalNumber;
    }
    //TIME LIMIT EXCEEDED
    public static int waysToMakeFair2(int[] nums) {
        int totalNumber=0;
        for (int i = 0; i <nums.length ; i++) {
            int totalOdd=0;
            int totalEven=0;
            for (int j = 0; j <nums.length ; j++) {
               if(i==j)
                   continue;

               if(j<i){
                   if(j%2==0)
                       totalEven+=nums[j];
                   else
                       totalOdd+=nums[j];
               }else{
                   if((j-1)%2==0)
                       totalEven+=nums[j];
                   else
                       totalOdd+=nums[j];
               }

            }
            if(totalEven==totalOdd)
                totalNumber++;
        }
        return totalNumber;
    }




}

