class Solution {
    public int[] twoSum(int[] numbers, int target) {
           int arr[]=new int[2];

        if(numbers==null || numbers.length==2)  {
            arr[0]=1;
            arr[1]=2;
            return arr;
        }
        int left=0,right=numbers.length-1;
        while (left<right){
            if(numbers[left]+numbers[right]==target){
                arr[0]=left+1;
                arr[1]=right+1;
                break;
            }
            if(numbers[left]+numbers[right]>target){
                right--;
            }else
                left++;
        }
    return arr;
    }
}