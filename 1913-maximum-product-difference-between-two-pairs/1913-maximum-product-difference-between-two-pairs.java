class Solution {
 static void insertionSort(int arr[], int n) {
        if (n <= 1) {
            return;
        }
        insertionSort( arr, n-1 );
        int last = arr[n-1];
        int j = n-2;

        while (j >= 0 && arr[j] > last) {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }

    public static int maxProductDifference(int[] nums) {

        insertionSort(nums,nums.length);

        return (nums[nums.length-1]*nums[nums.length-2])-(nums[0]*nums[1]);
    }
}