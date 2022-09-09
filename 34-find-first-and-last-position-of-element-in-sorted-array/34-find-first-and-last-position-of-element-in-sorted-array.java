class Solution {

    public static int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = leftIndex(nums, target);
        arr[1] = rightIndex(nums, target);
        return arr;
    }


    private static int leftIndex(int[] nums, int target){
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] >= target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
            if(nums[mid] == target) index = mid;
        }
        return index;
    }

    private static int rightIndex(int[] nums, int target){
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] <= target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
            if(nums[mid] == target) index = mid;
        }
        return index;
    }
}