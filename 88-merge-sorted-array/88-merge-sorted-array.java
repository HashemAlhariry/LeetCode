class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

              int newArrOfNum1[]=new int[m];
        System.arraycopy(nums1, 0,newArrOfNum1, 0, m);

        int firstIndex=0;
        int secondIndex=0;

        for (int i = 0; i <m+n ; i++) {

            if(firstIndex!=m && secondIndex!=n && newArrOfNum1[firstIndex]<=nums2[secondIndex]){
                nums1[i]=newArrOfNum1[firstIndex];
                firstIndex++;
                continue;
            }
            else if(secondIndex!=n && firstIndex!=m && newArrOfNum1[firstIndex]>nums2[secondIndex]){
                nums1[i]=nums2[secondIndex];
                secondIndex++;
                continue;
            }

            if(firstIndex<m){
                nums1[i]=newArrOfNum1[firstIndex];
                firstIndex++;
            }
            if(secondIndex<n){
                nums1[i]=nums2[secondIndex];
                secondIndex++;
            }
        }
    }
}