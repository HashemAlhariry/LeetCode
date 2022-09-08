class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
            int currentCounter=0;
        int totalCounter=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j =i; j <arr.length ; j++) {
                currentCounter+=arr[j];
                    if((j-i+1)%2!=0)
                        totalCounter+=currentCounter;
            }
            currentCounter=0;
        }
        
        return totalCounter;
    }
}