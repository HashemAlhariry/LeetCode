//Problem Description
/*
Given an array of integers nums, half of the integers in nums are odd, and the other half are even.

Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.

Return any answer array that satisfies this condition.



Example 1:

Input: nums = [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
Example 2:

Input: nums = [2,3]
Output: [2,3]


Constraints:

2 <= nums.length <= 2 * 104
nums.length is even.
Half of the integers in nums are even.
0 <= nums[i] <= 1000
*/
import java.util.PriorityQueue;
import java.util.Queue;

public class SortArrayByParity {

    public static void main(String[] args) {

        int arr[]=new int[]{1,2,3,4,5,6,7};
        int [] arr2 =sortArrayByParityII(arr);
        for (int i = 0; i <arr2.length ; i++) {
            System.out.println(arr2[i]);
        }
    }
    public static int[] sortArrayByParityII(int[] nums) {
        Queue<Integer> evenIndex =new PriorityQueue<>();
        Queue<Integer> oddIndex=new PriorityQueue<>();
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]%2==0)
                evenIndex.add(i);
            else
                oddIndex.add(i);
        }
        int arr[]=new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            if(evenIndex.size()>0){
                arr[i]= nums[evenIndex.poll()];
            }else
                arr[i]=nums[oddIndex.poll()];
        }
        return arr;
    }
}

