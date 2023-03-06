class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
 
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            int arr[] = new int[r[i]-l[i]+1];
            int index=0;
            for (int j = l[i]; j <= r[i]; j++) {
                arr[index]=nums[j];
                index++;
            }
            Arrays.sort(arr);
            boolean checker=true;
            if(arr.length>1) {
                int seq = arr[1]-arr[0];
                for (int j = 2; j < arr.length; j++) {
                    if(arr[j]-arr[j-1]==seq)
                        continue;
                    else {
                        checker=false;
                        break;
                    }
                }
            }
           result.add(checker);
        }
        return result;
    }
}