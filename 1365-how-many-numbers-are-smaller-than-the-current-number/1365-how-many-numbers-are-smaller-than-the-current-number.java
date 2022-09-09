class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
   int arr[]=new int[101];
        int arrTemp[]=new int[101];

        for (int i = 0; i <nums.length ; i++) {
                arr[nums[i]]+=1;

        }

        for (int i = 1; i <101 ; i++) {
            arrTemp[i]+=arr[i-1];
            arr[i]+=arr[i-1];
        }
        for (int i = 0; i <nums.length ; i++) {
            nums[i]=arrTemp[nums[i]];
        }

        return nums;
    }
}