class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            int arr[] = new int [nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            boolean checker =false;
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i]==nums2[j] && j!=nums2.length-1){
                   checker=true;
                }
              else  if (checker && nums1[i]<nums2[j]) {
                    arr[i]=nums2[j];
                    break;
                }
                

            }
            if(!checker|| arr[i]==0 )
                arr[i]=-1;

        }

        return arr;
    }
}